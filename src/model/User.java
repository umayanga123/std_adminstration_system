/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Uma
 */
public class User {
    private String iduser;
    private String name;
    private String password;
    private int capacity;
    private String lastlogin;

    public User() {
    }

    public User(String iduser, String name, String password, int capacity, String lastlogin) {
        this.iduser = iduser;
        this.name = name;
        this.password = password;
        this.capacity = capacity;
        this.lastlogin = lastlogin;
    }

    /**
     * @return the iduser
     */
    public String getIduser() {
        return iduser;
    }

    /**
     * @param iduser the iduser to set
     */
    public void setIduser(String iduser) {
        this.iduser = iduser;
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
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the lastlogin
     */
    public String getLastlogin() {
        return lastlogin;
    }

    /**
     * @param lastlogin the lastlogin to set
     */
    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

}
