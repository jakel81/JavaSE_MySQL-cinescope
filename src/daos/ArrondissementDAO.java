/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import entities.Arrondissement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayanakel
 */
public class ArrondissementDAO {

    private final Connection icnx;

    public ArrondissementDAO(Connection icnx) {
        this.icnx = icnx;
    }

    public int insert(Arrondissement d) {
        int liAffecte;

        try {
            //String lsSQL = "INSERT INTO arrondissement (code_arrondissement, nom_arrondissement) VALUES (?,?)";
            String lsSQL = "CALL arrondissementInsert(?,?)";
            System.out.println("lsSQL");
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setString(1, d.getCodeArrondissement());
            lpst.setString(2, d.getNomArrondissement());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException e) {
            liAffecte = -1;
            System.out.println(e.getMessage());
        }

        return liAffecte;
    }

    public int delete(Arrondissement d) {

        int liAffecte;

        try {
            //String lsSQL = "DELETE FROM arrondissement WHERE id_arrondissement = ?";
            String lsSQL = "CALL arrondissementDelete(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdArrondissement());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException ex) {
            liAffecte = -1;
            System.out.println(ex.getMessage());
        }

        return liAffecte;
    }

    public Arrondissement selectOne(int id) {
        Arrondissement d = new Arrondissement();

        try {
            //String lsSQL = "SELECT * FROM arrondissement WHERE id_arrondissement = ?";
            String lsSQL = "CALL arrondissementSelectOne(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdArrondissement());
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                d.setIdArrondissement(id);
                d.setCodeArrondissement(lrs.getString("code_arrondissement"));
                d.setNomArrondissement(lrs.getString("nom_arrondissement"));

            } else {
                d.setIdArrondissement(0);
                d.setCodeArrondissement("INTROUVABLE");
                d.setCodeArrondissement("INTROUVABLE");
            }
            lrs.close();
            lpst.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return d;
    }

    public List<Arrondissement> selectAll() {
        List<Arrondissement> liste = new ArrayList();
        Arrondissement d;

        try {
            //String lsSQL = "SELECT * FROM arrondissement";
            String lsSQL = "CALL arrondissementSelectAll()";
            Statement lpst = icnx.createStatement();
            ResultSet lrs = lpst.executeQuery(lsSQL);
            while (lrs.next()) {
                d = new Arrondissement(lrs.getInt(1), lrs.getString("code_arrondissement"), lrs.getString("nom_arrondissement"));
                liste.add(d);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            d = new Arrondissement(-1, e.getMessage(), e.getMessage());
            liste.add(d);
        }

        return liste;
    }

    public int update(Arrondissement d) {

        int liAffecte;

        try {
            //String lsSQL = "UPDATE arrondissement SET code_arrondissement = ?, nom_arrondissement = ? WHERE id_arrondissement = ?";
            String lsSQL = "CALL arrondissementUpdate(?,?,?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);

            lpst.setString(1, d.getCodeArrondissement());
            lpst.setString(2, d.getNomArrondissement());
            lpst.setInt(3, d.getIdArrondissement());

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
