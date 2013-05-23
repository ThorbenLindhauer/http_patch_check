package thorben.http_patch_check;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;

@Path("")
public class HttpPatchCheckResource {

  @PATCH
  @Path("/patch")
  @Produces(MediaType.APPLICATION_JSON)
  public Response handlePatchRequest(@Context Request request) {
    // do some stuff
    System.out.println("PATCH received");
    String response = "{\"content\" : \"Http PATCH successful\"}";
    return Response.ok(response, MediaType.APPLICATION_JSON).build();
  }
}
