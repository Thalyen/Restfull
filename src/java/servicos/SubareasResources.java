/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import modelo.Subarea;

/**
 * REST Web Service
 *
 * @author Tat
 */
@Path("subareas")
public class SubareasResources{

    private List<Subarea> subareas;
    private List<Subarea> subAreas;
    /**
     *
     * @Context private UriInfo context;
     *
     * Creates a new instance of FilmesResources
     */
    public SubareasResources() {
        subareas = new ArrayList<>();
        subAreas = new ArrayList<>();
        subareas.add(new Subarea(0, 0, "Subarea 00"));
        subareas.add(new Subarea(1, 0, "Subarea 01"));
        subareas.add(new Subarea(2, 0, "Subarea 02"));
        subareas.add(new Subarea(3, 1, "Subarea 03"));
        subareas.add(new Subarea(4, 1, "Subarea 04"));
        subareas.add(new Subarea(5, 1, "Subarea 05"));
        subareas.add(new Subarea(6, 1, "Subarea 06"));
    }

    /**
     * Retrieves representation of an instance of servicos.FilmesResources
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(subareas);
    }

    @Path("{subareaId}")
    @GET
    @Produces("application/json")
    public String getSubAreas(@PathParam("subareaId") String id) {
        for (Subarea area : subareas) {
            if (String.valueOf(area.getIdArea()).equals(id)) {
                subAreas.add(area);
            }
        }
        if(subAreas.isEmpty() || subAreas.size() < 0){
            return null;
        }else{
        Gson gson = new Gson();
        return gson.toJson(subAreas);
    }
 }

    /**
     * PUT method for updating or creating an instance of FilmesResources
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
