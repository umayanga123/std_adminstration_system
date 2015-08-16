/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Uma
 */
public class Grade {

    private String idgrade;
    private String name;
    private String gradeHead;
    private double admissionFee;
    private double schoolFee;
    private String inputter;
    private String lastModified;
    private String Notes;

    public Grade() {
    }

    public Grade(String idgrade, String name, String gradeHead, double admissionFee, double schoolFee, String Notes, String inputter, String lastModified) {
        this.idgrade = idgrade;
        this.name = name;
        this.gradeHead = gradeHead;
        this.admissionFee = admissionFee;
        this.schoolFee = schoolFee;
        this.inputter = inputter;
        this.lastModified = lastModified;
        this.Notes = Notes;
    }

    /**
     * @return the idgrade
     */
    public String getIdgrade() {
        return idgrade;
    }

    /**
     * @param idgrade the idgrade to set
     */
    public void setIdgrade(String idgrade) {
        this.idgrade = idgrade;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the gradeHead
     */
    public String getGradeHead() {
        return gradeHead;
    }

    /**
     * @param gradeHead the gradeHead to set
     */
    public void setGradeHead(String gradeHead) {
        this.gradeHead = gradeHead;
    }

    /**
     * @return the admissionFee
     */
    public double getAdmissionFee() {
        return admissionFee;
    }

    /**
     * @param admissionFee the admissionFee to set
     */
    public void setAdmissionFee(double admissionFee) {
        this.admissionFee = admissionFee;
    }

    /**
     * @return the inputter
     */
    public String getInputter() {
        return inputter;
    }

    /**
     * @param inputter the inputter to set
     */
    public void setInputter(String inputter) {
        this.inputter = inputter;
    }

    /**
     * @return the lastModified
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * @param lastModified the lastModified to set
     */
    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    /**
     * @return the Notes
     */
    public String getNotes() {
        return Notes;
    }

    /**
     * @param Notes the Notes to set
     */
    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    /**
     * @return the schoolFee
     */
    public double getSchoolFee() {
        return schoolFee;
    }

    /**
     * @param schoolFee the schoolFee to set
     */
    public void setSchoolFee(double schoolFee) {
        this.schoolFee = schoolFee;
    }
}
