package org.example.exvoiture;

import jakarta.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class VoitureService {

    // ----- Propriétés -----

    private List<Voiture> voitures = new ArrayList<>();


    // ----- Méthodes -----

    /**
     * Ajouter une nouvelle voiture
     */
    public Voiture save(Voiture voiture) {
        voitures.add(voiture);
        return voiture;
    }

    // Obtenir toutes les voitures
    public List<Voiture> findAll() {
        return voitures;
    }

}
