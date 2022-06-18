package it.unicam.cs.lc.lc2122.gedcom;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Rappresenta un individuo in un albero genealogico.
 *
 * @author Template: Luca Tesei
 */
public class Individual {
    // Codice univoco
    private final String code;
    // Tutti i campi seguenti possono essere null in caso di informazione non conosciuta
    private String givenName;
    private String surname;
    private GregorianCalendar birthDate;
    private String birthPlace;
    private GregorianCalendar deathDate;
    private String deathPlace;
    private String buryPlace;
    // lista di puntatori ai figli
    private List<Individual> childs;
    // puntatore al padre
    private Individual father;
    // puntatore alla madre
    private Individual mother;

    /**
     * Create a new individual with a code
     *
     * @param code unique code for the individual
     */
    public Individual(String code) {
        this.code = code;
        this.childs = new ArrayList<Individual>();
    }

    /**
     * @return the givenName
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * @param givenName the givenName to set
     */
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the birthDate
     */
    public GregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(GregorianCalendar birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the birthPlace
     */
    public String getBirthPlace() {
        return birthPlace;
    }

    /**
     * @param birthPlace the birthPlace to set
     */
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    /**
     * @return the deathDate
     */
    public GregorianCalendar getDeathDate() {
        return deathDate;
    }

    /**
     * @param deathDate the deathDate to set
     */
    public void setDeathDate(GregorianCalendar deathDate) {
        this.deathDate = deathDate;
    }

    /**
     * @return the deathPlace
     */
    public String getDeathPlace() {
        return deathPlace;
    }

    /**
     * @param deathPlace the deathPlace to set
     */
    public void setDeathPlace(String deathPlace) {
        this.deathPlace = deathPlace;
    }

    /**
     * @return the buryPlace
     */
    public String getBuryPlace() {
        return buryPlace;
    }

    /**
     * @param buryPlace the buryPlace to set
     */
    public void setBuryPlace(String buryPlace) {
        this.buryPlace = buryPlace;
    }

    /**
     * @return the childs
     */
    public List<Individual> getChilds() {
        return childs;
    }

    /**
     * Add a child
     *
     * @param child the child to add
     */
    public void addChild(Individual child) {
        this.childs.add(child);
    }

    /**
     * @return the father
     */
    public Individual getFather() {
        return father;
    }

    /**
     * @param father the father to set
     */
    public void setFather(Individual father) {
        this.father = father;
    }

    /**
     * @return the mother
     */
    public Individual getMother() {
        return mother;
    }

    /**
     * @param mother the mother to set
     */
    public void setMother(Individual mother) {
        this.mother = mother;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Individual other = (Individual) obj;
        return Objects.equals(code, other.code);
    }

    @Override
    public String toString() {
        String[] i = new String[1];
        i[0] = "Individual{" +
                "code = " + this.code;
        i[0] += (this.givenName != null) ? ", givenName = " + this.givenName : " ";
        i[0] += (this.surname != null) ? ", surname = " + this.surname : " ";
        i[0] += (this.birthDate != null) ? ", birth date = " + this.toFormattedDate(this.birthDate) : "";
        i[0] += (this.birthPlace != null) ? ", birth place = " + this.birthPlace : "";
        i[0] += (this.deathDate != null) ? ", death date = " + this.toFormattedDate(this.deathDate) : "";
        i[0] += (this.deathPlace != null) ? ", death place = " + this.deathPlace : "";
        i[0] += (this.buryPlace != null) ? ", bury place = " + this.buryPlace : "";
        i[0] += (this.father != null) ? ", father = " + this.father : "";
        i[0] += (this.mother != null) ? ", mother = " + this.mother : "";
        i[0] += (this.father != null) ? ", father = " + this.father : "";
        this.childs.forEach(c -> i[0] += ", child code = " + c.code + "\n");
        return i[0];
    }

    /**
     * Convenient method that converts a {@link GregorianCalendar} in a simple date format like 'dd/MM/yyyy'.
     * Returns a string represents the date in the format 'dd/MM/yyyy'.
     *
     * @param gregorianCalendar the {@code GregorianCalendar} which to convert
     * @return a string represents the date in the format 'dd/MM/yyyy'.
     */
    private String toFormattedDate(GregorianCalendar gregorianCalendar) {
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd/MM/yyyy");
        return formattedDate.format(gregorianCalendar.getTime());
    }

}