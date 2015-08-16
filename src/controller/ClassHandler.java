/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dbtire.DBConnection;
import dbtire.DBHandle;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Clases;

/**
 *
 * @author AndJ
 */
public class ClassHandler {

    public static int addClass(Clases cls) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO class VALUES ('" + cls.getIdclass() + "','" + cls.getName() + "','" + cls.getDescription() + "','" + cls.getLocation() + "','" + cls.getClassTeacher() + "','" + cls.getAssistantTeacher() + "','"+ cls.getIdgrade() + "')";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int updateClass(Clases cls) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE class SET name = '" + cls.getName() + "',description = '" + cls.getDescription() + "',location='" + cls.getLocation()+ "',classTeacher='" + cls.getClassTeacher() + "',assistantTeacher = '" + cls.getAssistantTeacher() + "',idgrade = '" + cls.getIdgrade() +"' WHERE idclass = '" + cls.getIdclass() + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int deleteClass(String idclass) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM class WHERE idclass='" + idclass + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }
    public static Clases getFirstRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Clases cls = null;
        if (res.first() & res.getString(1).length()>0) {
            cls = new Clases(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7));
        }
        return cls;
    }
    public static Clases getNextRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Clases cls = null;
        if (res.next() & res.getString(1).length()>0) {
            cls = new Clases(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7));
        }
        return cls;
    }
    public static Clases getPreviousRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Clases cls = null;
        if (res.previous() & res.getString(1).length()>0 ) {
            cls = new Clases(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7));
        }
        return cls;
    }
    public static Clases getLastRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Clases cls = null;
        if (res.last() & res.getString(1).length()>0) {
            cls = new Clases(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7));
        }
        return cls;
    }
    public static Clases getClass(String idclass) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM class WHERE Idclass='" + idclass + "'";
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        Clases cls = null;
        if (res.next()) {
            cls = new Clases(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7));
        }
        return cls;
    }
    public static ResultSet setNavigationResultSet(String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM "+table;
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        return res;
    }
}
