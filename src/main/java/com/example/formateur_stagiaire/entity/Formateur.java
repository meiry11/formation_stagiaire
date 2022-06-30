package com.example.formateur_stagiaire.entity;

import javax.persistence.*;
import java.util.List;
@Entity
public class Formateur extends Personne {
    @ManyToMany
    @JoinTable(name="competence",
            uniqueConstraints=@UniqueConstraint(columnNames={ "personne_id", "matiere_id" }),
            joinColumns=@JoinColumn(name="personne_id", referencedColumnName="PERS_ID"),
            inverseJoinColumns=@JoinColumn(name="matiere_id", referencedColumnName="MAT_ID"))
    private List<Matiere> matieres;

    private String dateEmbauche;
    private int experience;
    private boolean status;
    @ManyToOne
    private List<Stagiaire> stagiaires;


    public Formateur(Long id, String civilité, String nom, String prenom, String email, String adresse) {
        super(id, civilité, nom, prenom, email, adresse);
    }
}