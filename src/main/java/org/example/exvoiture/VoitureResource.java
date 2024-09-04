package org.example.exvoiture;

import java.util.List;
import java.util.ArrayList;

import jakarta.ws.rs.Path;
import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;


@Path("/voiture")
public class VoitureResource {

    private final VoitureService voitureService;

    @Inject
    public VoitureResource(VoitureService voitureService){
        this.voitureService = voitureService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture hello() {
        Voiture voiture = new Voiture(1,"Toyota",1999, "Rouge");
        return voiture;
    }

    @GET
    @Path("/test")
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture testService() {
        return new Voiture(1,"Toyota",2020, "Rouge");
    }

    @GET
    @Path("/test2")
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture test2Service() {

//        voitureService.save(1,"Toyota",2020, "Rouge");

        List<Voiture> voiture = new ArrayList<>();
        voiture.add(new Voiture(1,"Toyota",2020, "Rouge"));
        voiture.add(new Voiture(2,"Peugeot",2021, "Blanc"));

        return (Voiture) voiture;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Voiture postVoiture(Voiture voiture){
        voiture.setId(55);
        return voiture;
    }

    @POST
    @Path("/params")
    @Produces(MediaType.APPLICATION_JSON)
    public Voiture postVoiture2(@QueryParam("marque") String marque, @QueryParam("age") int age) {
        return new Voiture(1,"Toyota",2020, "Rouge");
    }

    @DELETE
    @Path("{id}") // verbe DELETE  http://localhost:8080/ExVoiture_war_exploded/api/voiture/XX
    public int delete(@PathParam("id") int id){
        return id;
    }

}
