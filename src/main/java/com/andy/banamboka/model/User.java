package com.andy.banamboka.model;

import javax.persistence.*;
import java.io.Serializable;
/**
 *
 * @author Ir Andy
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(unique = true)
    private String telephone;
    private String password;
    @Column(unique = true)
    private String email;
    private String whatsapp;
    private boolean professionel;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(String whatsapp) {
        this.whatsapp = whatsapp;
    }

    public boolean isProfessionel() {
        return professionel;
    }

    public void setProfessionel(boolean professionel) {
        this.professionel = professionel;
    }
}
