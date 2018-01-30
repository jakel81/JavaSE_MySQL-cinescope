/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author rayanakel
 */
public class Arrondissement {
    
    /*
    *Attributs
    */
    
    private int idArrondissement;
    private String codeArrondissement;
    private String nomArrondissement;
    
    /*
    *Constructeurs
    */

    public Arrondissement(String codeArrondissement, String nomArrondissement) {
        this.codeArrondissement = codeArrondissement;
        this.nomArrondissement = nomArrondissement;
    }

    public Arrondissement(int idArrondissement, String codeArrondissement, String nomArrondissement) {
        this.idArrondissement = idArrondissement;
        this.codeArrondissement = codeArrondissement;
        this.nomArrondissement = nomArrondissement;
    }

    public Arrondissement() {
    }
    
    
    /*
    *Getters/Setters
    */

    public int getIdArrondissement() {
        return idArrondissement;
    }

    public void setIdArrondissement(int idArrondissement) {
        this.idArrondissement = idArrondissement;
    }

    public String getCodeArrondissement() {
        return codeArrondissement;
    }

    public void setCodeArrondissement(String codeArrondissement) {
        this.codeArrondissement = codeArrondissement;
    }

    public String getNomArrondissement() {
        return nomArrondissement;
    }

    public void setNomArrondissement(String nomArrondissement) {
        this.nomArrondissement = nomArrondissement;
    }

    @Override
    public String toString() {
        return "Arrondissement{" + "idArrondissement=" + idArrondissement + ", codeArrondissement=" + codeArrondissement + ", nomArrondissement=" + nomArrondissement + '}';
    }
    
    
}
