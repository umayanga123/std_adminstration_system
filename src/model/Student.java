/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author Uma
 */
public class Student {
    private String idStudent;
    private String firstName;
    private String middleNames;
    private String lastName;
    private String title;
    private String DOB;
    private String nationality;
    private String instMedium;
    private String relegion;
    private String add1;
    private String add2;
    private String city;
    private String postalCode;
    private String transMode;
    private String vehicalNo;
    private String faName;
    private String faNIC;
    private String faAdd;
    private String faTel;
    private String faEmail;
    private String faOccupation;
    private String faOffice;
    private String faOfTel;
    private String faMobile;
    private String maName;
    private String maNIC;
    private String maAdd;
    private String maTel;
    private String maEmail;
    private String maOccupation;
    private String maOffice;
    private String maOfTel;
    private String maMobile;
    private String classId;
    private String admDate;
    private String startDate;
    private String notes;
    private String inputter;
    private String lastModified;
    private String sibGroup;
    private String lastPayMon;


    public Student() {
    }

    public Student(String idStudent) {
        this.idStudent = idStudent;
    }

    public Student(String idStudent, String firstName, String middleNames, String lastName, String title, String DOB, String nationality, String instMedium, String relegion, String add1, String add2, String city, String postalCode, String transMode, String vehicalNo, String faName, String faNIC, String faAdd, String faTel, String faEmail, String faOccupation, String faOffice, String faOfTel, String faMobile, String maName, String maNIC, String maAdd, String maTel, String maEmail, String maOccupation, String maOffice, String maOfTel, String maMobile, String classId, String admDate, String startDate, String notes, String inputter, String lastModified, String sibGroup, String lastPayMon) {
        this.idStudent = idStudent;
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.lastName = lastName;
        this.title = title;
        this.DOB = DOB;
        this.nationality = nationality;
        this.instMedium = instMedium;
        this.relegion = relegion;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.postalCode = postalCode;
        this.transMode = transMode;
        this.vehicalNo = vehicalNo;
        this.faName = faName;
        this.faNIC = faNIC;
        this.faAdd = faAdd;
        this.faTel = faTel;
        this.faEmail = faEmail;
        this.faOccupation = faOccupation;
        this.faOffice = faOffice;
        this.faOfTel = faOfTel;
        this.faMobile = faMobile;
        this.maName = maName;
        this.maNIC = maNIC;
        this.maAdd = maAdd;
        this.maTel = maTel;
        this.maEmail = maEmail;
        this.maOccupation = maOccupation;
        this.maOffice = maOffice;
        this.maOfTel = maOfTel;
        this.maMobile = maMobile;
        this.classId = classId;
        this.admDate = admDate;
        this.startDate = startDate;
        this.notes = notes;
        this.inputter = inputter;
        this.lastModified = lastModified;
        this.sibGroup = sibGroup;
        this.lastPayMon = lastPayMon;

    }



    /**
     * @return the idStudent
     */
    public String getIdStudent() {
        return idStudent;
    }

    /**
     * @param idStudent the idStudent to set
     */
    public void setIdStudent(String idStudent) {
        this.idStudent = idStudent;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the middleNames
     */
    public String getMiddleNames() {
        return middleNames;
    }

    /**
     * @param middleNames the middleNames to set
     */
    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the instMedium
     */
    public String getInstMedium() {
        return instMedium;
    }

    /**
     * @param instMedium the instMedium to set
     */
    public void setInstMedium(String instMedium) {
        this.instMedium = instMedium;
    }

    /**
     * @return the relegion
     */
    public String getRelegion() {
        return relegion;
    }

    /**
     * @param relegion the relegion to set
     */
    public void setRelegion(String relegion) {
        this.relegion = relegion;
    }

    /**
     * @return the add1
     */
    public String getAdd1() {
        return add1;
    }

    /**
     * @param add1 the add1 to set
     */
    public void setAdd1(String add1) {
        this.add1 = add1;
    }

    /**
     * @return the add2
     */
    public String getAdd2() {
        return add2;
    }

    /**
     * @param add2 the add2 to set
     */
    public void setAdd2(String add2) {
        this.add2 = add2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the transMode
     */
    public String getTransMode() {
        return transMode;
    }

    /**
     * @param transMode the transMode to set
     */
    public void setTransMode(String transMode) {
        this.transMode = transMode;
    }

    /**
     * @return the vehicalNo
     */
    public String getVehicalNo() {
        return vehicalNo;
    }

    /**
     * @param vehicalNo the vehicalNo to set
     */
    public void setVehicalNo(String vehicalNo) {
        this.vehicalNo = vehicalNo;
    }

    /**
     * @return the faName
     */
    public String getFaName() {
        return faName;
    }

    /**
     * @param faName the faName to set
     */
    public void setFaName(String faName) {
        this.faName = faName;
    }

    /**
     * @return the faNIC
     */
    public String getFaNIC() {
        return faNIC;
    }

    /**
     * @param faNIC the faNIC to set
     */
    public void setFaNIC(String faNIC) {
        this.faNIC = faNIC;
    }

    /**
     * @return the faAdd
     */
    public String getFaAdd() {
        return faAdd;
    }

    /**
     * @param faAdd the faAdd to set
     */
    public void setFaAdd(String faAdd) {
        this.faAdd = faAdd;
    }

    /**
     * @return the faTel
     */
    public String getFaTel() {
        return faTel;
    }

    /**
     * @param faTel the faTel to set
     */
    public void setFaTel(String faTel) {
        this.faTel = faTel;
    }

    /**
     * @return the faEmail
     */
    public String getFaEmail() {
        return faEmail;
    }

    /**
     * @param faEmail the faEmail to set
     */
    public void setFaEmail(String faEmail) {
        this.faEmail = faEmail;
    }

    /**
     * @return the faOccupation
     */
    public String getFaOccupation() {
        return faOccupation;
    }

    /**
     * @param faOccupation the faOccupation to set
     */
    public void setFaOccupation(String faOccupation) {
        this.faOccupation = faOccupation;
    }

    /**
     * @return the faOffice
     */
    public String getFaOffice() {
        return faOffice;
    }

    /**
     * @param faOffice the faOffice to set
     */
    public void setFaOffice(String faOffice) {
        this.faOffice = faOffice;
    }

    /**
     * @return the faOfTel
     */
    public String getFaOfTel() {
        return faOfTel;
    }

    /**
     * @param faOfTel the faOfTel to set
     */
    public void setFaOfTel(String faOfTel) {
        this.faOfTel = faOfTel;
    }

    /**
     * @return the faMobile
     */
    public String getFaMobile() {
        return faMobile;
    }

    /**
     * @param faMobile the faMobile to set
     */
    public void setFaMobile(String faMobile) {
        this.faMobile = faMobile;
    }

    /**
     * @return the maName
     */
    public String getMaName() {
        return maName;
    }

    /**
     * @param maName the maName to set
     */
    public void setMaName(String maName) {
        this.maName = maName;
    }

    /**
     * @return the maNIC
     */
    public String getMaNIC() {
        return maNIC;
    }

    /**
     * @param maNIC the maNIC to set
     */
    public void setMaNIC(String maNIC) {
        this.maNIC = maNIC;
    }

    /**
     * @return the maAdd
     */
    public String getMaAdd() {
        return maAdd;
    }

    /**
     * @param maAdd the maAdd to set
     */
    public void setMaAdd(String maAdd) {
        this.maAdd = maAdd;
    }

    /**
     * @return the maTel
     */
    public String getMaTel() {
        return maTel;
    }

    /**
     * @param maTel the maTel to set
     */
    public void setMaTel(String maTel) {
        this.maTel = maTel;
    }

    /**
     * @return the maEmail
     */
    public String getMaEmail() {
        return maEmail;
    }

    /**
     * @param maEmail the maEmail to set
     */
    public void setMaEmail(String maEmail) {
        this.maEmail = maEmail;
    }

    /**
     * @return the maOccupation
     */
    public String getMaOccupation() {
        return maOccupation;
    }

    /**
     * @param maOccupation the maOccupation to set
     */
    public void setMaOccupation(String maOccupation) {
        this.maOccupation = maOccupation;
    }

    /**
     * @return the maOffice
     */
    public String getMaOffice() {
        return maOffice;
    }

    /**
     * @param maOffice the maOffice to set
     */
    public void setMaOffice(String maOffice) {
        this.maOffice = maOffice;
    }

    /**
     * @return the maOfTel
     */
    public String getMaOfTel() {
        return maOfTel;
    }

    /**
     * @param maOfTel the maOfTel to set
     */
    public void setMaOfTel(String maOfTel) {
        this.maOfTel = maOfTel;
    }

    /**
     * @return the maMobile
     */
    public String getMaMobile() {
        return maMobile;
    }

    /**
     * @param maMobile the maMobile to set
     */
    public void setMaMobile(String maMobile) {
        this.maMobile = maMobile;
    }

    /**
     * @return the classId
     */
    public String getClassId() {
        return classId;
    }

    /**
     * @param classId the classId to set
     */
    public void setClassId(String classId) {
        this.classId = classId;
    }

    /**
     * @return the admDate
     */
    public String getAdmDate() {
        return admDate;
    }

    /**
     * @param admDate the admDate to set
     */
    public void setAdmDate(String admDate) {
        this.admDate = admDate;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the notes
     */
    public String getNotes() {
        return notes;
    }

    /**
     * @param notes the notes to set
     */
    public void setNotes(String notes) {
        this.notes = notes;
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
     * @return the sibGroup
     */
    public String getSibGroup() {
        return sibGroup;
    }

    /**
     * @param sibGroup the sibGroup to set
     */
    public void setSibGroup(String sibGroup) {
        this.sibGroup = sibGroup;
    }

    /**
     * @return the lastPayMon
     */
    public String getLastPayMon() {
        return lastPayMon;
    }

    /**
     * @param lastPayMon the lastPayMon to set
     */
    public void setLastPayMon(String lastPayMon) {
        this.lastPayMon = lastPayMon;
    }


}
