/**
 * A non-ambiguous grammar for GEDCOM file.
 *
 * This grammar can be used to compute ancestors or descendants of an individual.
 * This implementation is based on the walker pattern.
 *
 * @author Piermichele Rosati
 */
grammar GEDCOM;

@header{
package it.unicam.cs.lc.lc2122.gedcom.generatedsources;
}

/* Grammar rules */
s : head NEWLINE trlr ;
head : HEAD (NEWLINE head_tag)* (NEWLINE block)* ;
head_tag : gedc | charr | date1 | file | lang ;
gedc : GEDC (NEWLINE VERS)?  ;
charr : CHARR STR;
date1 : DATE1 period=('BEF' | 'AFT' | 'ABT' | 'EST ')? (day=(DAY_MONTH | DAYS) ('/'|'-'|' '))? (month=(DAY_MONTH | F_STR_MONTHS)? ('/'|'-'|' '))? YEAR (NEWLINE TIME)? ;
date2 : DATE2 period=('BEF' | 'AFT' | 'ABT' | 'EST ')? (day=(DAY_MONTH | DAYS) ('/'|'-'|' '))? (month=(DAY_MONTH | F_STR_MONTHS)? ('/'|'-'|' '))?  YEAR;
file :  FILE FILENAME;
lang : LANG STR ;
block : individual | family ;
individual : '0 ' CODE INDI (NEWLINE indi_tag)* ;
indi_tag : complete_name | SEX | birt | deat | buri | fams | famc ;
complete_name : COMPLETE_NAME nam=(STR|' ')+ '/' surn=(STR|' ')+ '/' ( (NEWLINE surname NEWLINE name) | (NEWLINE name NEWLINE surname) ) ;
surname : SURN (STR | ' ')+ ;
name : NAME (STR | ' ')+ ;
birt : BIRT (NEWLINE date2)? (NEWLINE plac)? ;
plac : PLAC (STR | ' ' | ',')+ ;
deat : DEAT (NEWLINE date2)? (NEWLINE plac)? ;
buri : BURI (NEWLINE plac)? ;
fams : FAMS CODE (fams)* ;
famc : FAMC CODE ;
family : '0 ' CODE FAM (NEWLINE fam_tag)* ;
fam_tag : (i=(HUSB | WIFE | CHIL) CODE) | marr ;
marr : MARR (NEWLINE date2 | NEWLINE plac)* ;
trlr : TRLR (NEWLINE req)? ;
req : REQ CODE ;

/*  Lexer tokens */
AT : '@' ;
DATE1: '1 ' 'DATE ' ;
DATE2: '2 ' 'DATE ' ;
CODE : AT [a-zA-Z0-9]+ AT ;
HEAD : '0 ' 'HEAD' ;
GEDC : '1 ' 'GEDC' ;
VERS : '2 VERS ' F_VERSION ;
TIME : '2 TIME ' ('0'?[0-9] | '1'[1-9] | '2'[0-3])':'[0-5][0-9](':'[0-5][0-9])? ;
FILE : '1 ' 'FILE ' ;
FILENAME : STR '.ged';
LANG : '1 ' 'LANG ' ;
CHARR : '1 ' 'CHAR ' ;
TRLR : '0 ' 'TRLR' ;
FAM : ' ' 'FAM';
MARR : '1 ' 'MARR' ;
HUSB : '1 ' 'HUSB ' ;
WIFE : '1 ' 'WIFE ' ;
CHIL : '1 ' 'CHIL ' ;
INDI : ' ' 'INDI' ;
COMPLETE_NAME : '1 ' 'NAME ' ;
SURN: '2 ' 'SURN ' ;
NAME : '2 ' 'GIVN ' ;
SEX : '1 ' 'SEX ' [MFO] ;
BIRT : '1 ' 'BIRT' ;
DEAT : '1 ' 'DEAT' ;
BURI : '1 ' 'BURI' ;
PLAC : '2 ' 'PLAC ' ;
FAMS : '1 ' 'FAMS ' ;
FAMC : '1 ' 'FAMC ' ;
REQ : '0 ' ('ANCE ' | 'DESC ') ;
DAY_MONTH: [0-9] | '1'[0-2] ;
DAYS: '1'[3-9] | '2'[0-9] | '3'[0-1] ;
YEAR : [0-9][0-9][0-9][0-9] ;
F_STR_MONTHS : F_STR_ENG_MONTHS | F_STR_ITA_MONTHS;
// Newline, White spaces
NEWLINE: '\r'? '\n' ;
WS : [ \t]+ -> skip ;
// string as last token for first longest matching
STR: ~('\r' | '\n' | ' ' | '/' | ',')+ ;
// Convenient fragment tokens
fragment F_VERSION : [0-9]+('.'[0-9]*)* ;
fragment F_STR_ENG_MONTHS : ('Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'July' | 'Aug' | 'Sept' | 'Oct' | 'Nov' | 'Dec' | 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JULY' | 'AUG' | 'SEPT' | 'OCT' | 'NOV' | 'DEC') ;
fragment F_STR_ITA_MONTHS : ('Gen' | 'Feb' | 'Mar' | 'Apr' | 'Mag' | 'Giu' | 'Lug' | 'Ago' | 'Set' | 'Ott' | 'Nov' | 'Dic' | 'GEN' | 'FEB' | 'MAR' | 'APR' | 'MAG' | 'GIU' | 'LUG' | 'AGO' | 'SET' | 'OTT' | 'NOV' | 'DIC') ;