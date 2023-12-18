/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dbtire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author AndJ
 */
public class DBHandle {

    public static int setData(Connection con, String query) throws ClassNotFoundException, SQLException {
        Statement stm = con.createStatement();
        int res = stm.executeUpdate(query);
        return res;
    }

    public static ResultSet getData(Connection con, String query) throws ClassNotFoundException, SQLException {
        Statement stm = con.createStatement();
        ResultSet rst = stm.executeQuery(query);
        return rst;
    }

}
