/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Uma
 */
public class Clases {

    private String idclass;
    private String name;
    private String description;
    private String location;
    private String classTeacher;
    private String assistantTeacher;
    private String idgrade;

    public Clases() {
    }

    public Clases(String idclass, String name, String description, String location, String classTeacher, String assistantTeacher, String idgrade) {
        this.idclass = idclass;
        this.name = name;
        this.description = description;
        this.location = location;
        this.classTeacher = classTeacher;
        this.assistantTeacher = assistantTeacher;
        this.idgrade = idgrade;
    }

    /**
     * @return the idclass
     */
    public String getIdclass() {
        return idclass;
    }

    /**
     * @param idclass the idclass to set
     */
    public void setIdclass(String idclass) {
        this.idclass = idclass;
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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return the classTeacher
     */
    public String getClassTeacher() {
        return classTeacher;
    }

    /**
     * @param classTeacher the classTeacher to set
     */
    public void setClassTeacher(String classTeacher) {
        this.classTeacher = classTeacher;
    }

    /**
     * @return the assistantTeacher
     */
    public String getAssistantTeacher() {
        return assistantTeacher;
    }

    /**
     * @param assistantTeacher the assistantTeacher to set
     */
    public void setAssistantTeacher(String assistantTeacher) {
        this.assistantTeacher = assistantTeacher;
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
}
