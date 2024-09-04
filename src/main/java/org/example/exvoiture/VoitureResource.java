package org.example.exvoiture;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;


@Path("/voiture")
public class VoitureResource {

    // ----- Propriétés -----

    private final VoitureService voitureService;


    // ----- Méthodes -----

    @Inject
    public VoitureResource(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Voiture> getAll() {
        return voitureService.findAll();
    }


}
