/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Departement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayanakel
 */
public class DepartementDAO {

    private Connection icnx;

    public DepartementDAO(Connection icnx) {
        this.icnx = icnx;
    }

    public int insert(Departement d) {
        int liAffecte;

        try {
            //String lsSQL = "INSERT INTO departement (code_departement, nom_departement) VALUES (?,?)";
            String lsSQL = "CALL departementInsert(?,?)";
            System.out.println("lsSQL");
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setString(1, d.getCodeDepartement());
            lpst.setString(2, d.getNomDepartement());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException e) {
            liAffecte = -1;
            System.out.println(e.getMessage());
        }

        return liAffecte;
    }

    public int delete(Departement d) {

        int liAffecte;

        try {
            //String lsSQL = "DELETE FROM departement WHERE id_departement = ?";
            String lsSQL = "CALL departementDelete(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdDepartement());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException ex) {
            liAffecte = -1;
            System.out.println(ex.getMessage());
        }

        return liAffecte;
    }

    public Departement selectOne(int id) {
        Departement d = new Departement();

        try {
            //String lsSQL = "SELECT * FROM departement WHERE id_departement = ?";
            String lsSQL = "CALL departementSelectOne(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdDepartement());
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                d.setIdDepartement(id);
                d.setCodeDepartement(lrs.getString("code_departement"));
                d.setNomDepartement(lrs.getString("nom_departement"));

            } else {
                d.setIdDepartement(0);
                d.setCodeDepartement("INTROUVABLE");
                d.setCodeDepartement("INTROUVABLE");
            }
            lrs.close();
            lpst.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return d;
    }

    public List<Departement> selectAll() {
        List<Departement> liste = new ArrayList();
        Departement d;

        try {
            //String lsSQL = "SELECT * FROM departement";
            String lsSQL = "CALL departementSelectAll()";
            Statement lpst = icnx.createStatement();
            ResultSet lrs = lpst.executeQuery(lsSQL);
            while (lrs.next()) {
                d = new Departement(lrs.getInt(1), lrs.getString("code_departement"), lrs.getString("nom_departement"));
                liste.add(d);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            d = new Departement(-1, e.getMessage(), e.getMessage());
            liste.add(d);
        }

        return liste;
    }

    public int update(Departement d) {

        int liAffecte;

        try {
            //String lsSQL = "UPDATE departement SET code_departement = ?, nom_departement = ? WHERE id_departement = ?";
            String lsSQL = "CALL departementUpdate(?,?,?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            
            lpst.setString(1, d.getCodeDepartement());
            lpst.setString(2, d.getNomDepartement());
            lpst.setInt(3, d.getIdDepartement());
            
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException ex) {
            liAffecte = -1;
            System.out.println(ex.getMessage());
        }

        return liAffecte;

    }
}

