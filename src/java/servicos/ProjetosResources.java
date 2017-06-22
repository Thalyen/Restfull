/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicos;

import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;
import javax.json.JsonObject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author tat
 */

@Path("projetos")
public class ProjetosResources {

    private JsonObject projeto ;
    
    public ProjetosResources() {
        
    }
    
    @GET
    @Produces("application/json")
    public String getJson() {
        Gson gson = new Gson();
        return gson.toJson(projeto);
    }

    @Path("{idArea}")
    @GET
    @Produces("application/json")
    public String getAreas(@PathParam("idArea") String id) {
        /*for (Area area : projeto) {
            if (String.valueOf(area.getId()).equals(id)){
                Gson gson = new Gson();
                return gson.toJson(area);
            }
        }*/
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

