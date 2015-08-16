/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import com.toedter.calendar.JDateChooser;
import dbtire.DBConnection;
import dbtire.DBHandle;
import java.io.File;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import net.sourceforge.barbecue.Barcode;
import net.sourceforge.barbecue.BarcodeException;
import net.sourceforge.barbecue.BarcodeFactory;
import net.sourceforge.barbecue.BarcodeImageHandler;
import net.sourceforge.barbecue.output.OutputException;

/**
 *
 * @author Uma
 */
public class CommonMethods {

    public static void getNextID(JTextField txtID, String prefix, String column, String table, int zeros) {
        try {
            Connection con = DBConnection.getDBConnection();
            ResultSet rst = DBHandle.getData(con, "SELECT " + column + " FROM " + table + " ORDER BY 1 DESC LIMIT 1");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(zeros);

            String current;
            if (zeros == 4) {
                current = prefix + "0000";
            } else {
                current = prefix + "000";
            }
            while (rst.next()) {
                current = rst.getString(1);
            }
            ////////////////////////////
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txtID.setText(current.substring(0, index) + String.format("%04d", i));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getNextID(JTextField txtID, String prefix, String column, String table) {
        try {
            Connection con = DBConnection.getDBConnection();
            ResultSet rst = DBHandle.getData(con, "SELECT " + column + " FROM " + table + " ORDER BY 1 DESC LIMIT 1");
            NumberFormat nf = NumberFormat.getInstance();
            nf.setMinimumIntegerDigits(3);
            String current;
            current = prefix + "000";
            while (rst.next()) {
                current = rst.getString(1);
            }
            ////////////////////////////
            int index = current.length();
            for (int i = current.length() - 1; i >= 0; i--) {
                String part = current.substring(i, current.length());
                try {
                    Integer.parseInt(part);
                } catch (Exception e) {
                    index = i + 1;
                    break;
                }
            }
            String s = current.substring(index);
            int i = Integer.parseInt(s);
            i++;
            txtID.setText(current.substring(0, index) + nf.format(i));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getCurrentDateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public static String getCurrentUser() {
        return "Andrew";
    }

    public static String getDbDate(JDateChooser dtDateChooser) {
        Date dt = dtDateChooser.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(dt);
    }

    public static void setDbDate(String dateText, JDateChooser dtDateChooser) throws ParseException {
        Date parsedDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateText);
        dtDateChooser.setDate(parsedDate);
    }

    public static ArrayList fillComboDesc(JComboBox cmb, Connection con, String table, String descField, String idField) throws ClassNotFoundException, SQLException {
        Statement stm = con.createStatement();
        String query = "SELECT " + idField + "," + descField + " FROM " + table;
        ResultSet rst = stm.executeQuery(query);
        ArrayList ids = new ArrayList();
        cmb.removeAllItems();
        cmb.addItem("");
        while (rst.next()) {
            cmb.addItem(rst.getString(2));
            ids.add(rst.getString(1));
        }
        return ids;

    }

    public static boolean backupDB(String dbName, String dbUserName, String dbPassword, String path) {
        String executeCmd = "C:/Program Files/MySQL/MySQL Server 5.5/bin/mysqldump -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r " + path;
        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            if (runtimeProcess.waitFor() == 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static boolean restoreDB(String dbName, String dbUserName, String dbPassword, String source) {
        //String[] executeCmd = new String[]{"C:/Program Files/MySQL/MySQL Server 5.5/bin/mysql", "--user=" + dbUserName, "--password=" + dbPassword, dbName,"-e",source};
        String executeCmd = "cmd /c mysql " + dbName + " -h localhost -u " + dbUserName + " -p" + dbPassword + "<" + source;
        String s="\"C:\\Program Files\\MySQL\\MySQL Server 5.5\\bin\\mysql\" stdadmin -h localhost -u root -pijse<C:\\Andrew\\Java\\project\\Working\\StdAdmin\\backup\\bkup20120307170952.bksql";
        System.out.println(s);
        Process runtimeProcess;
        try {
            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            if (runtimeProcess.waitFor() == 0) {
                return true;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public static void outputtingBarcodeAsPNG(String Code, File f) throws BarcodeException, OutputException {
        Barcode barcode = BarcodeFactory.createCode128B(Code);
        BarcodeImageHandler.savePNG(barcode, f);
    }

    public static String[] readXmlConnectionString() {
        String xmlPath = "./configValues.xml";
        String conString[] = new String[3];
        File file = new File(xmlPath);
        if (file.exists()) {
            Xml config = new Xml(xmlPath, "config");
            Xml login = config.child("login");
            conString[0] = "jdbc:mysql://" + login.child("db-host").content() + ":" + login.child("db-port").content() + "/" + login.child("db-name").content();
            conString[1] = login.child("db-username").content();
            conString[2] = login.child("db-password").content();
        }
        return conString;
    }

    public static String getPaymentDueDay() {
        String xmlPath = "./configValues.xml";
        File file = new File(xmlPath);
        if (file.exists()) {
            Xml config = new Xml(xmlPath, "config");
            Xml payment = config.child("payment");
            return payment.child("payduedate").content();
        } else {
            return "7";
        }
    }

    public static int setPaymentDueDay(String day) {
        String xmlPath = "./configValues.xml";
        File file = new File(xmlPath);
        if (file.exists()) {
            Xml config = new Xml(xmlPath, "config");
            Xml payment = config.child("payment");
            payment.child("payduedate").setContent(day);
            return 1;
        } else {
            return 0;
        }
    }
}

