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
import modelo.Area;

/**
 * REST Web Service
 *
 * @author Tat
 */
@Path("areas")
public class AreasResources {
    
    private List<Area> areas ;
    
    public AreasResources() {
        areas = new ArrayList<>();
        areas.add(new Area(0, "Ciências Sociais Aplicadas"));
        areas.add(new Area(1, "Ciências Exatas e da Terra"));
        areas.add(new Area(2, "Engenharias"));
        areas.add(new Area(3, "Linguística, Letras e Artes"));
        areas.add(new Area(4, "Ciências Agrárias"));
        areas.add(new Area(5, "Ciências Biológicas"));
        areas.add(new Area(6, "Ciências Humanas"));
        areas.add(new Area(7, "Ciências da Saúde"));
    }
    
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(areas);
    }

    @Path("{idArea}")
    @GET
    @Produces("application/json")
    public String getAreas(@PathParam("idArea") String id) {
        for (Area area : areas) {
            if (String.valueOf(area.getId()).equals(id)){
                Gson gson = new Gson();
                return gson.toJson(area);
            }
        }
        return null;
    }

    /**
     * PUT method for updating or creating an instance of 
     *
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
