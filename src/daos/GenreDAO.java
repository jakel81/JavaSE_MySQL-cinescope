/*
 * 
 */
package daos;

import entities.Genre;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rayanakel
 */
public class GenreDAO implements IDAO<Genre> {

    private final Connection icnx;

    public GenreDAO(Connection icnx) {
        this.icnx = icnx;
    }

    @Override
    public int insert(Genre objet) {
        int liAffecte;

        try {
            String lsSQL = "CALL genreInsert(?,?,?)";
            System.out.println("lsSQL");
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setString(1, objet.getCodeGenre());
            lpst.setString(2, objet.getLibelleGenre());
            lpst.setString(3, objet.getGenreGrammatical());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException e) {
            liAffecte = -1;
            System.out.println(e.getMessage());
        }

        return liAffecte;
    }

    @Override
    public List<Genre> selectAll() {
        List<Genre> liste = new ArrayList();
        Genre d;

        try {
            String lsSQL = "CALL genreSelectAll()";
            Statement lpst = icnx.createStatement();
            ResultSet lrs = lpst.executeQuery(lsSQL);
            while (lrs.next()) {
                d = new Genre(lrs.getInt(1), lrs.getString("code_genre"), lrs.getString("libelle_genre"), lrs.getString("genre_grammatical"));
                liste.add(d);
            }
            lrs.close();
            lpst.close();
        } catch (SQLException e) {
            d = new Genre(-1, e.getMessage(), e.getMessage(), e.getMessage());
            liste.add(d);
        }

        return liste;
    }

    @Override
    public Genre selectOne(int id) {
        Genre d = new Genre();

        try {
            String lsSQL = "CALL genreSelectOne(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, d.getIdGenre());
            ResultSet lrs = lpst.executeQuery();
            if (lrs.next()) {
                d.setIdGenre(id);
                d.setCodeGenre(lrs.getString("code_genre"));
                d.setLibelleGenre(lrs.getString("libelle_genre"));
                d.setGenreGrammatical(lrs.getString("genre_grammatical"));

            } else {
                d.setIdGenre(0);
                d.setCodeGenre("INTROUVABLE");
                d.setLibelleGenre("INTROUVABLE");
                d.setGenreGrammatical("INTROUVABLE");
            }
            lrs.close();
            lpst.close();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return d;
    }

    @Override
    public int delete(Genre objet) {
        int liAffecte;

        try {
            String lsSQL = "CALL genreDelete(?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);
            lpst.setInt(1, objet.getIdGenre());
            liAffecte = lpst.executeUpdate();

            icnx.commit();

            lpst.close();

        } catch (SQLException ex) {
            liAffecte = -1;
            System.out.println(ex.getMessage());
        }

        return liAffecte;
    }

    @Override
    public int update(Genre objet) {
        int liAffecte;

        try {
            String lsSQL = "CALL genreUpdate(?,?,?,?)";
            PreparedStatement lpst = icnx.prepareStatement(lsSQL);

            lpst.setString(1, objet.getCodeGenre());
            lpst.setString(2, objet.getLibelleGenre());
            lpst.setString(3, objet.getGenreGrammatical());
            lpst.setInt(4, objet.getIdGenre());

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
