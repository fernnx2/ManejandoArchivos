/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRest;

import com.google.gson.Gson;
import java.math.BigDecimal;
import java.net.URI;
import java.util.List;
import javax.json.Json;
import javax.json.JsonObject;
import javax.swing.JOptionPane;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Equipo;

/**
 *
 * @author fernando
 */
@Path("/service")
public class EquipoResource {
    
    public EquipoResource(){
    
        
      
       
    }
    
    @POST
    @Path("/send")
    @Consumes(MediaType.APPLICATION_JSON)
     public Response postE(Equipo e){
      
         
          String output = e.toString();
          return Response.status(200).entity(output).build();
        

     
    }
    
}
