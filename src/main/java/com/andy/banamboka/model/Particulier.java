package com.andy.banamboka.model;

import com.andy.banamboka.model.User;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Ir Andy
 */
@Entity(name = "particulier")
@PrimaryKeyJoinColumn(name = "fk_part_id")
public class Particulier extends User  {
    private String nom;
    private String postnom;
    private String prenom;

    private char sex;
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPostnom() {
        return postnom;
    }

    public void setPostnom(String postnom) {
        this.postnom = postnom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }


}
