/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import connexion.Connexion;
import entities.Departement;
import java.sql.*;

/**
 *
 * @author rayanakel
 */
public class DepartementDAOTests {

    public static void main(String[] args) {
        Connection lcnx = Connexion.seConnecter("127.0.0.1", "8889", "root", "root", "cinescope2014");

//test de la connection SQL
//        if (lcnx == null) {
//            System.out.println("connection ko");
//        } else {
//Test de l'insertion dans la table
//            Departement d = new Departement("99", "Neuf");
//            DepartementDAO dao = new DepartementDAO(lcnx);
//            int r = dao.insert(d);
//            System.out.println(r);
//        Departement d = new Departement(1, "99", "neuf");
//        DepartementDAO dao = new DepartementDAO(lcnx);
//        int r = dao.insert(d);
//        System.out.println(r);

        Departement d = new Departement("75", "Paris");
        DepartementDAO dao = new DepartementDAO(lcnx);
        int r = dao.insert(d);
        System.out.println(r);

    }

}
