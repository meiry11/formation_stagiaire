package com.example.formateur_stagiaire.entity;

import javax.validation.constraints.Size;

import javax.persistence.*;
import java.util.List;

@Entity
public abstract class Personne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long personne_id;
    @Column
    @Size(max=10)
    public String civilité;
    @Column
    @Size(max=255)
    public String nom;
    @Column
    @Size(max=255)
    public String prenom;
    @Column
    @Size(max=255)
    public String email;

    @ManyToOne
    @JoinColumn(name = "adress_id")
    private Adress adress;



    public Personne(Long id, String civilité, String nom, String prenom, String email, String adresse) {
        this.personne_id = id;
        this.civilité = civilité;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;

    }

    public Personne() {

    }

    public Long getId() {
        return personne_id;
    }

    public void setId(Long id) {
        this.personne_id = id;
    }

    public String getCivilité() {
        return civilité;
    }

    public void setCivilité(String civilité) {
        this.civilité = civilité;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }
}
