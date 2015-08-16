/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.CommonMethods;
import dbtire.DBConnection;
import dbtire.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

/**
 *
 * @author AndJ
 */
public class UserHandler {

    public static int addUser(User usr) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO user VALUES ('" + usr.getIduser() + "','" + usr.getName() + "',(select password('" + usr.getPassword() + "'))," + usr.getCapacity() + ",'" + CommonMethods.getCurrentDateTime() + "' )";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int updateUser(User usr) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE user SET name = '" + usr.getName() + "',password = (select password('" + usr.getPassword() + "')),capacity=" + usr.getCapacity() + " WHERE iduser = '" + usr.getIduser() + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }
    public static int updateUserLog(String userID, String timestamp) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE user SET lastlogin = '" + timestamp + "' WHERE iduser = '" + userID + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int deleteUser(String iduser) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM user WHERE iduser='" + iduser + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static User getFirstRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        User usr = null;
        if (res.first()) {
            usr = new User(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
        }
        return usr;
    }

    public static User getNextRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        User usr = null;
        if (res.next()) {
            usr = new User(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
        }
        return usr;
    }

    public static User getPreviousRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        User usr = null;
        if (res.previous()) {
            usr = new User(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
        }
        return usr;
    }

    public static User getLastRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        User usr = null;
        if (res.last()) {
            usr = new User(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
        }
        return usr;
    }

    public static User getUser(String iduser) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM user WHERE Iduser='" + iduser + "'";
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        User usr = null;
        if (res.next()) {
            usr = new User(res.getString(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5));
        }
        return usr;
    }

    public static int validateUser(String iduser, String pass) throws SQLException, ClassNotFoundException {
        int valid = 0;
        String sql = "select password,(select password('" + pass + "')),capacity from user where iduser='" + iduser + "'";
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        if (res.next())
            if (res.getString(1).equals(res.getString(2))) {
                valid = res.getInt(3);
                updateUserLog(iduser,CommonMethods.getCurrentDateTime());
            }
        return valid;
    }

    public static ResultSet setNavigationResultSet(String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM " + table;
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int getUserHandel() throws SQLException, ClassNotFoundException {
        int handel = 0;
        String sql = "select capacity from user order by lastlogin desc limit 1";
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        if (res.next())
            handel = res.getInt(1);
        return handel;
    }

}
