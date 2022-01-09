package com.andy.banamboka.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Ir Andy
 */
@Entity(name = "Entreprise")
@PrimaryKeyJoinColumn(name = "fk_compte_id")
public class Entreprise extends User{
    private String nom;
    private String rccm;
    private int nombreEmployes;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRccm() {
        return rccm;
    }

    public void setRccm(String rccm) {
        this.rccm = rccm;
    }

    public int getNombreEmployes() {
        return nombreEmployes;
    }

    public void setNombreEmployes(int nombreEmployes) {
        this.nombreEmployes = nombreEmployes;
    }
}
