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
import model.Grade;


/**
 *
 * @author AndJ
 */
public class GradeHandler {

    public static int addGrade(Grade grade) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO grade VALUES ('" + grade.getIdgrade() + "','" + grade.getName() + "','" + grade.getGradeHead() + "'," + grade.getAdmissionFee() + "," + grade.getSchoolFee() + ",'" + grade.getNotes() + "','"+ grade.getInputter() + "','" + grade.getLastModified() + "')";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int updateGrade(Grade grade) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE grade SET name = '" + grade.getName() + "',gradeHead = '" + grade.getGradeHead() + "',admissionFee=" + grade.getAdmissionFee()+ ",schoolFee=" + grade.getSchoolFee() + ",Notes = '" + grade.getNotes() + "',Inputter = '" + CommonMethods.getCurrentUser() + "',lastModified = '" + CommonMethods.getCurrentDateTime() +"' WHERE Idgrade = '" + grade.getIdgrade() + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }

    public static int deleteGrade(String idgrade) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM grade WHERE Idgrade='" + idgrade + "'";
        int res = DBHandle.setData(DBConnection.getDBConnection(),sql);
        return res;
    }
    public static Grade getFirstRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Grade grade = null;
        if (res.first()) {
            grade = new Grade(res.getString(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDouble(5),res.getString(6),res.getString(7),res.getString(8));
        }
        return grade;
    }
    public static Grade getNextRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Grade grade = null;
        if (res.next()) {
            grade = new Grade(res.getString(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDouble(5),res.getString(6),res.getString(7),res.getString(8));
        }
        return grade;
    }
    public static Grade getPreviousRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Grade grade = null;
        if (res.previous() & res.getString(1).length()>0) {
            grade = new Grade(res.getString(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDouble(5),res.getString(6),res.getString(7),res.getString(8));
        }
        return grade;
    }
    public static Grade getLastRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Grade grade = null;
        if (res.last()) {
            grade = new Grade(res.getString(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDouble(5),res.getString(6),res.getString(7),res.getString(8));
        }
        return grade;
    }
    public static Grade getGrade(String idgrade) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM grade WHERE Idgrade='" + idgrade + "'";
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        Grade grade = null;
        if (res.next()) {
            grade = new Grade(res.getString(1), res.getString(2), res.getString(3), res.getDouble(4), res.getDouble(5),res.getString(6),res.getString(7),res.getString(8));
        }
        return grade;
    }
    public static ResultSet setNavigationResultSet(String table) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM "+table;
        ResultSet res = DBHandle.getData(DBConnection.getDBConnection(),sql);
        return res;
    }
}
