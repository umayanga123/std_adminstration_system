/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dbtire.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import model.Teacher;

/**
 *
 * @author AndJ
 */
public class TeacherHandler {

    private static Connection conn;
    private static Statement stm;

    public static int addTeacher(Teacher teacher) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "INSERT INTO teacher VALUES ('" + teacher.getIdteacher() + "','" + teacher.getTitle() + "','" + teacher.getName() + "','" + teacher.getDOB() + "','" + teacher.getAdd1() + "','" + teacher.getAdd2() + "','" + teacher.getCity() + "','" + teacher.getTel()+ "','" + teacher.getMobile()+ "','" + teacher.getJoiningDate()+ "'," + teacher.getStatus()+ ")";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int updateTeacher(Teacher teacher) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "UPDATE teacher SET title = '" + teacher.getTitle() + "',name = '" + teacher.getName() + "',DOB='" + teacher.getDOB() + "',add1 = '" + teacher.getAdd1() + "',add2 = '" + teacher.getAdd2()+ "',city = '" + teacher.getCity()+ "',tel = '" + teacher.getTel()+ "',mobile = '" + teacher.getMobile()+ "',joiningDate = '" + teacher.getJoiningDate() + "',status = " + teacher.getStatus()+" WHERE Idteacher = '" + teacher.getIdteacher() + "'";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int deleteTeacher(String idteacher) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "DELETE FROM teacher WHERE Idteacher='" + idteacher + "'";
        int res = stm.executeUpdate(sql);
        return res;
    }
    public static Teacher getFirstRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Teacher teacher = null;
        if (res.first()) {
            teacher = new Teacher(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getInt(11));
        }
        return teacher;
    }
    public static Teacher getNextRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Teacher teacher = null;
        if (res.next() && res.getString(1).length()>0) {
            teacher = new Teacher(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getInt(11));
        }
        return teacher;
    }
    public static Teacher getPreviousRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Teacher teacher = null;
        if (res.previous() && res.getString(1).length()>0) {
            teacher = new Teacher(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getInt(11));
        }
        return teacher;
    }
    public static Teacher getLastRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Teacher teacher = null;
        if (res.last()) {
            teacher = new Teacher(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getInt(11));
        }
        return teacher;
    }
    public static Teacher getTeacher(String idteacher) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "SELECT * FROM teacher WHERE Idteacher='" + idteacher + "'";
        ResultSet res = stm.executeQuery(sql);
        Teacher teacher = null;
        if (res.next()) {
            teacher = new Teacher(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5),res.getString(6),res.getString(7),res.getString(8),res.getString(9),res.getString(10),res.getInt(11));
        }
        return teacher;
    }
    public static ResultSet setNavigationResultSet(String table) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "SELECT * FROM "+table;
        ResultSet res = stm.executeQuery(sql);
        return res;
    }
}
