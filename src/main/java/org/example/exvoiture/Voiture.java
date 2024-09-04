package org.example.exvoiture;

public class Voiture {

    // ----- Propriétés -----

    private int id;
    private String marque;
    private int anneefabrication;
    private String couleur;


    // ----- Constructeur -----

    public Voiture(int id, String marque, int anneefabrication, String couleur) {
        this.id = id;
        this.marque = marque;
        this.anneefabrication = anneefabrication;
        this.couleur = couleur;
    }


    // ----- Getters/Setters -----

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public int getAnneefabrication() {
        return anneefabrication;
    }

    public void setAnneefabrication(int anneefabrication) {
        this.anneefabrication = anneefabrication;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

}
