package com.example.formateur_stagiaire.entity;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Stagiaire extends Personne{
    private String dateNaissance;
    @OneToMany
    private Formateur formateur;


    public Stagiaire(Long id, String civilité, String nom, String prenom, String email, String adresse) {
        super(id, civilité, nom, prenom, email, adresse);
    }
}
