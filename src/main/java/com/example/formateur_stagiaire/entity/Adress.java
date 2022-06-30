package com.example.formateur_stagiaire.entity;

import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;

import javax.persistence.*;

public class Adress {
    @OneToOne
    private Stagiaire stagiaire;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @Size(max=255)
    private String rue;
    @Column
    @Size(max=255)
    private String complement;
    @Column
    @Size(max=10)
    private int posteCode;
    @Column
    @Size(max=100)
    private String ville;
    @Column
    @Size(max=100)
    private String pays;

    public Adress(Long id, String rue, String complement, int posteCode, String ville, String pays) {
        this.id = id;
        this.rue = rue;
        this.complement = complement;
        this.posteCode = posteCode;
        this.ville = ville;
        this.pays = pays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getComplement() {
        return complement;
    }

    public void setComplement(String complement) {
        this.complement = complement;
    }

    public int getPosteCode() {
        return posteCode;
    }

    public void setPosteCode(int posteCode) {
        this.posteCode = posteCode;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
