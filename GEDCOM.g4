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
s : head NEWLINE trlr;
head :  HEAD (NEWLINE head_tag)* (NEWLINE block)* ;
head_tag : gedc | charr | date1 | file | lang ;
gedc : GEDC (NEWLINE VERS)?  ;
charr : CHARR ;
date1 : DATE1 DATEFORMAT (NEWLINE TIME)? ;
date2 : DATE2 DATEFORMAT ;
file :  FILE ;
lang : LANG ;
block : individual | family ;
individual : ZERO AT CODE AT INDI (NEWLINE indi_tag)* ;
indi_tag : complete_name | SEX | birt | deat | buri | fams | famc ;
complete_name : COMPLETE_NAME CN ( (NEWLINE surname NEWLINE name) | (NEWLINE name NEWLINE surname) ) ;
surname : SURN F_SURNAME_NAME;
name : NAME F_SURNAME_NAME;
birt : BIRT (NEWLINE date2)? (NEWLINE plac)? ;
plac : PLAC ;
deat : DEAT (NEWLINE date2)? (NEWLINE plac)?;
buri : BURI (NEWLINE plac)? ;
fams : FAMS AT CODE AT (NEWLINE FAMS)? ;
famc : FAMC AT CODE AT (NEWLINE FAMC)? ;
family : ZERO AT CODE AT FAM (NEWLINE fam_tag)*  ;
fam_tag : (i=(HUSB | WIFE | CHIL) AT CODE AT) | marr ;
marr : MARR (NEWLINE date2 | NEWLINE plac)* ;
trlr : TRLR (NEWLINE req)? ;
req : REQ AT CODE AT ;

/*  Lexer tokens */

HEAD : ZERO 'HEAD' ;
GEDC : ONE 'GEDC' ;
VERS : TWO 'VERS ' F_VERSION ;
TIME : TWO 'TIME ' ('0'?[0-9] | '1'[1-9] | '2'[0-3])':'[0-5][0-9]':'[0-5][0-9] ;
FILE : ONE 'FILE ' F_STR'.ged' ;
LANG : ONE 'LANG ' F_STR ;
CHARR : ONE 'CHAR ' F_STR ;
TRLR : ZERO 'TRLR' ;
FAM : ' ' 'FAM';
MARR : ONE 'MARR' ;
HUSB : ONE 'HUSB ' ;
WIFE : ONE 'WIFE ' ;
CHIL : ONE 'CHIL ' ;
INDI : ' ' 'INDI' ;
COMPLETE_NAME : ONE 'NAME ' ;
CODE : [a-zA-Z0-9]+ ;
CN : F_SURNAME_NAME ' /' F_SURNAME_NAME '/' ;
F_SURNAME_NAME : ([A-Z][a-z]* | ' ' | '\'' )+ ;
SURN: TWO 'SURN ' ;
NAME : TWO 'GIVN ' ;
SEX : ONE 'SEX ' [MFO] ;
BIRT : ONE 'BIRT' ;
DEAT : ONE 'DEAT' ;
BURI : ONE 'BURI' ;
PLAC : TWO 'PLAC ' F_STR;
FAMS : ONE 'FAMS ' ;
FAMC : ONE 'FAMC ' ;
ZERO : '0' ' ' ;
ONE : '1' ' ';
TWO : '2' ' ';
AT : '@' ;
DATEFORMAT : (' ' ('BEF' | 'AFT' | 'ABT' | 'EST'))? (' ' F_DAY)? ('/'|'-'|' ')? F_MONTH? ('/'|'-'|' ')? F_YEAR ;
DATE1: ONE 'DATE';
DATE2: TWO 'DATE';
REQ : ZERO ('ANCE ' | 'DESC ') ;

// Convenient fragment tokens
fragment F_STR: ~('\r' | '\n')+ ;
fragment F_VERSION : [0-9]+('.'[0-9]*)* ;
fragment F_DAY : ('0'?[0-9] | '1'[0-9] | '2'[0-9] | '30' | '31') ;
fragment F_MONTH : ('0'?[0-9] | '10' | '11' | '12' | F_STR_MONTHS ) ;
fragment F_STR_MONTHS : F_STR_ENG_MONTHS | F_STR_ITA_MONTHS;
fragment F_STR_ENG_MONTHS : ('Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'July' | 'Aug' | 'Sept' | 'Oct' | 'Nov' | 'Dec' | 'JAN' | 'FEB' | 'MAR' | 'APR' | 'MAY' | 'JUN' | 'JULY' | 'AUG' | 'SEPT' | 'OCT' | 'NOV' | 'DEC') ;
fragment F_STR_ITA_MONTHS : ('Gen' | 'Feb' | 'Mar' | 'Apr' | 'Mag' | 'Giu' | 'Lug' | 'Ago' | 'Set' | 'Ott' | 'Nov' | 'Dic' | 'GEN' | 'FEB' | 'MAR' | 'APR' | 'MAG' | 'GIU' | 'LUG' | 'AGO' | 'SET' | 'OTT' | 'NOV' | 'DIC') ;
fragment F_YEAR : [0-9][0-9][0-9][0-9] ;

// Newline, White spaces
NEWLINE: '\r'? '\n' ;
WS : [ \t]+ -> skip ;