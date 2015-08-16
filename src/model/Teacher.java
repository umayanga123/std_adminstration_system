/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Uma
 */
public class Teacher {

    private String idteacher;
    private String title;
    private String name;
    private String DOB;
    private String add1;
    private String add2;
    private String city;
    private String tel;
    private String mobile;
    private String joiningDate;
    private int status;

    public Teacher() {
    }

    public Teacher(String idteacher, String title, String name, String DOB, String add1, String add2, String city, String tel, String mobile, String joiningDate, int status) {
        this.idteacher = idteacher;
        this.title = title;
        this.name = name;
        this.DOB = DOB;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.tel = tel;
        this.mobile = mobile;
        this.joiningDate = joiningDate;
        this.status = status;
    }

    /**
     * @return the idteacher
     */
    public String getIdteacher() {
        return idteacher;
    }

    /**
     * @param idteacher the idteacher to set
     */
    public void setIdteacher(String idteacher) {
        this.idteacher = idteacher;
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
     * @return the tel
     */
    public String getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the joiningDate
     */
    public String getJoiningDate() {
        return joiningDate;
    }

    /**
     * @param joiningDate the joiningDate to set
     */
    public void setJoiningDate(String joiningDate) {
        this.joiningDate = joiningDate;
    }

    /**
     * @return the status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(int status) {
        this.status = status;
    }
}
