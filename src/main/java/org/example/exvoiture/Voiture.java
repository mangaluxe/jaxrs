package org.example.exvoiture;

/*
Création d'une application JAX-RS qui permet de faire un CRUD complet sur les entités voiture.

Une voiture sera constitue d'au moins :
- id
- marque
- annee de fabrication
- couleur

On pourra recuperer la liste complete des voitures ou alors une seul voiture par rapport a son id.
*/

public class Voiture {

    // ----- Propriétés -----

    private int id;
    private String marque;
    private int anneefabrication;
    private String couleur;


    // ----- Constructeur -----

    public Voiture() {
    }

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
