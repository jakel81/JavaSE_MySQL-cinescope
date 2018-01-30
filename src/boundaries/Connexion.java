/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundaries;

import java.sql.*;

/**
 *
 * @author rayanakel
 */
public class Connexion {

    public static Connection seConnecter(String psIP, String psPort, String psUT, String psMDP, String psBD) {
        Connection lcn = null;

        String lsDSN = "jdbc:mysql://" + psIP + ":" + psPort + "/" + psBD;

        try {
            lcn = DriverManager.getConnection(lsDSN, psUT, psMDP);
            lcn.setAutoCommit(false);
        } catch (SQLException e) {

        }
        return lcn;
    }

    public static void seDeconnecter(Connection pcnx) {
        try {
            pcnx.close();
            pcnx = null;
        } catch (SQLException e) {

        }
    }

}
