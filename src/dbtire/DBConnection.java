/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtire;

import common.CommonMethods;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AndJ
 */
public class DBConnection {

    private static DBConnection dbCon;
    private final Connection con;

    private DBConnection() throws ClassNotFoundException, SQLException {
        String[] conDetails = CommonMethods.readXmlConnectionString();
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(conDetails[0], conDetails[1], conDetails[2]);
    }

    private static DBConnection getDBCon() throws ClassNotFoundException, SQLException {
        if (dbCon == null) {
            dbCon = new DBConnection();
        }
        return dbCon;
    }

    public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
        return getDBCon().con;
    }

}
