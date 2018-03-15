/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceRest;

import com.google.gson.Gson;
import java.math.BigDecimal;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import pojos.Equipo;

/**
 *
 * @author fernando
 */
public class ClienteRest {
    
    
    
    public Response postEquipos(Equipo e){
      
        Client cliente = ClientBuilder.newClient();
        JsonObject j = Json.createObjectBuilder().add("historico", e.getHistorico()).build();
         WebTarget webTarget = cliente.target("http://localhost:9090/JerseyJSONExample/rest/jsonServices/send");
         Response response = webTarget.path("/raiz").request(MediaType.APPLICATION_JSON).post(Entity.json(j));

         return response;

        
    }
    
    
}
