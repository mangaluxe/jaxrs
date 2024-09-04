package org.example.exvoiture;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VoitureService {

    public Voiture save(int id, String marque, int anneefabrication, String couleur) {
        return new Voiture(id, marque, anneefabrication, couleur);
    }

}
