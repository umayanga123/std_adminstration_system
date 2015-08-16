/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import common.CommonMethods;
import dbtire.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import model.Student;

/**
 *
 * @author AndJ
 */
public class StudentHandler {

    private static Connection conn;
    private static Statement stm;

    public static int addStudent(Student student) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "INSERT INTO student VALUES ('" + student.getIdStudent() + "','" + student.getFirstName() + "','" + student.getMiddleNames() + "','" + student.getLastName() + "','" + student.getTitle()
                + "','" + student.getDOB() + "','" + student.getNationality() + "','" + student.getInstMedium() + "','" + student.getRelegion()
                + "','" + student.getAdd1() + "','" + student.getAdd2() + "','" + student.getCity() + "','" + student.getPostalCode() + "','" + student.getTransMode() + "','" + student.getVehicalNo()
                + "','" + student.getFaName() + "','" + student.getFaNIC() + "','" + student.getFaAdd() + "','" + student.getFaOfTel() + "','" + student.getFaEmail() + "','" + student.getFaOccupation() + "','" + student.getFaOffice() + "','" + student.getFaOfTel() + "','" + student.getFaMobile()
                + "','" + student.getMaName() + "','" + student.getMaNIC() + "','" + student.getMaAdd() + "','" + student.getMaOfTel() + "','" + student.getMaEmail() + "','" + student.getMaOccupation() + "','" + student.getMaOffice() + "','" + student.getMaOfTel() + "','" + student.getMaMobile()
                + "','" + student.getClassId() + "','" + student.getAdmDate() + "','" + student.getStartDate() + "','" + student.getNotes() + "','" + CommonMethods.getCurrentUser() + "','" + CommonMethods.getCurrentDateTime() + "','" + student.getSibGroup() + "','" + student.getLastPayMon() + "')";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int addSibling(String idSibling, String idstudent) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "INSERT INTO siblings VALUES ('" + idSibling + "','" + idstudent + "')";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int deleteSiblings(String idSibling) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "delete FROM siblings where idsiblings ='" + idSibling + "'";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static void getSiblingToList(String idSibling, JList jl) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "Select * from siblings where idsiblings = '" + idSibling + "'";
        ResultSet res = stm.executeQuery(sql);
        DefaultListModel dlf = (DefaultListModel) jl.getModel();
        dlf.removeAllElements();
        while (res.next()) {
            dlf.addElement(res.getString(2));
        }
    }

    public static ResultSet getStudentDetails(String moreFilter) throws ClassNotFoundException, SQLException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "select idStudent,concat(title,' ',firstName,' ',middlenames,' ',lastname) as Name,DOB,class.name,StartDate,city  from  student,class, grade where class.idclass=student.classId and class.idgrade=grade.idgrade ";
        sql += moreFilter;
        ResultSet res = stm.executeQuery(sql);
        return res;
    }

    public static int updateStudent(Student student) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "UPDATE student SET title = '" + student.getTitle()
                + "',firstName = '" + student.getFirstName()
                + "',middleNames = '" + student.getMiddleNames()
                + "',lastName = '" + student.getLastName()
                + "',DOB='" + student.getDOB()
                + "',nationality='" + student.getNationality()
                + "',instMedium='" + student.getInstMedium()
                + "',relegion='" + student.getRelegion()
                + "',add1 = '" + student.getAdd1()
                + "',add2 = '" + student.getAdd2()
                + "',city = '" + student.getCity()
                + "',transMode = '" + student.getTransMode()
                + "',VehicalNo = '" + student.getVehicalNo()
                + "',faName = '" + student.getFaName()
                + "',faNIC = '" + student.getFaNIC()
                + "',faAdd = '" + student.getFaAdd()
                + "',faTel = '" + student.getFaTel()
                + "',faEmail = '" + student.getFaEmail()
                + "',faOccupation = '" + student.getFaOccupation()
                + "',faOffice = '" + student.getFaOffice()
                + "',faOfTel = '" + student.getFaOfTel()
                + "',faMobile = '" + student.getFaMobile()
                + "',maName = '" + student.getMaName()
                + "',maNIC = '" + student.getMaNIC()
                + "',maAdd = '" + student.getMaAdd()
                + "',maTel = '" + student.getMaTel()
                + "',maEmail = '" + student.getMaEmail()
                + "',maOccupation = '" + student.getMaOccupation()
                + "',maOffice = '" + student.getMaOffice()
                + "',maOfTel = '" + student.getMaOfTel()
                + "',maMobile = '" + student.getMaMobile()
                + "',classId = '" + student.getClassId()
                + "',admDate = '" + student.getAdmDate()
                + "',startDate = '" + student.getStartDate()
                + "',notes = '" + student.getNotes()
                + "',inputter = '" + CommonMethods.getCurrentUser()
                + "',lastModified = '" + CommonMethods.getCurrentDateTime()
                + "',sibGroup = '" + student.getSibGroup()
                + "' WHERE Idstudent = '" + student.getIdStudent() + "'";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static int deleteStudent(String idstudent) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "DELETE FROM Student WHERE Idstudent='" + idstudent + "'";
        int res = stm.executeUpdate(sql);
        return res;
    }

    public static Student getFirstRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Student student = null;
        if (res.first()) {
            student = new Student(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20),
                    res.getString(21), res.getString(22), res.getString(23), res.getString(24), res.getString(25), res.getString(26), res.getString(27), res.getString(28), res.getString(29), res.getString(30),
                    res.getString(31), res.getString(32), res.getString(33), res.getString(34), res.getString(35), res.getString(36), res.getString(37), res.getString(38), res.getString(39), res.getString(40), res.getString(41));
        }
        return student;
    }

    public static Student getNextRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Student student = null;
        if (res.next()) {
            student = new Student(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20),
                    res.getString(21), res.getString(22), res.getString(23), res.getString(24), res.getString(25), res.getString(26), res.getString(27), res.getString(28), res.getString(29), res.getString(30),
                    res.getString(31), res.getString(32), res.getString(33), res.getString(34), res.getString(35), res.getString(36), res.getString(37), res.getString(38), res.getString(39), res.getString(40), res.getString(41));
        }
        return student;
    }

    public static Student getPreviousRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Student student = null;
        if (res.previous()) {
            student = new Student(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20),
                    res.getString(21), res.getString(22), res.getString(23), res.getString(24), res.getString(25), res.getString(26), res.getString(27), res.getString(28), res.getString(29), res.getString(30),
                    res.getString(31), res.getString(32), res.getString(33), res.getString(34), res.getString(35), res.getString(36), res.getString(37), res.getString(38), res.getString(39), res.getString(40), res.getString(41));
        }
        return student;
    }

    public static Student getLastRecord(ResultSet res) throws SQLException, ClassNotFoundException {
        Student student = null;
        if (res.last()) {
            student = new Student(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20),
                    res.getString(21), res.getString(22), res.getString(23), res.getString(24), res.getString(25), res.getString(26), res.getString(27), res.getString(28), res.getString(29), res.getString(30),
                    res.getString(31), res.getString(32), res.getString(33), res.getString(34), res.getString(35), res.getString(36), res.getString(37), res.getString(38), res.getString(39), res.getString(40), res.getString(41));
        }
        return student;
    }

    public static Student getStudent(String idstudent) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "SELECT * FROM student WHERE Idstudent='" + idstudent + "'";
        ResultSet res = stm.executeQuery(sql);
        Student student = null;
        if (res.next()) {
            student = new Student(res.getString(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5), res.getString(6), res.getString(7), res.getString(8), res.getString(9), res.getString(10),
                    res.getString(11), res.getString(12), res.getString(13), res.getString(14), res.getString(15), res.getString(16), res.getString(17), res.getString(18), res.getString(19), res.getString(20),
                    res.getString(21), res.getString(22), res.getString(23), res.getString(24), res.getString(25), res.getString(26), res.getString(27), res.getString(28), res.getString(29), res.getString(30),
                    res.getString(31), res.getString(32), res.getString(33), res.getString(34), res.getString(35), res.getString(36), res.getString(37), res.getString(38), res.getString(39), res.getString(40), res.getString(41));
        }
        return student;
    }

    public static ResultSet setNavigationResultSet(String table) throws SQLException, ClassNotFoundException {
        conn = DBConnection.getDBConnection();
        stm = conn.createStatement();
        String sql = "SELECT * FROM " + table;
        ResultSet res = stm.executeQuery(sql);
        return res;
    }
}
