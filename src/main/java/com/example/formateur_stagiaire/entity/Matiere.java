package com.example.formateur_stagiaire.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long matiere_id;
    @ManyToMany
    @JoinTable(name="competence",
            uniqueConstraints=@UniqueConstraint(columnNames={ "matiere_id", "formateur_id" }),
            joinColumns=@JoinColumn(name="matiere_id", referencedColumnName="matiere_id"),
            inverseJoinColumns=@JoinColumn(name="formateur_id", referencedColumnName="id"))
            private List<Formateur> formateurs;

    @Column
    private  String nom;
    @Column
    private  int duree;
    @Column
    private boolean difficulte;

    public Matiere(Long id, String nom, int duree, boolean difficulte) {
        this.matiere_id = id;
        this.nom = nom;
        this.duree = duree;
        this.difficulte = difficulte;
    }

    public Matiere() {

    }

    public Long getId() {
        return matiere_id;
    }

    public void setId(Long id) {
        this.matiere_id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public boolean isDifficulte() {
        return difficulte;
    }

    public void setDifficulte(boolean difficulte) {
        this.difficulte = difficulte;
    }
}
