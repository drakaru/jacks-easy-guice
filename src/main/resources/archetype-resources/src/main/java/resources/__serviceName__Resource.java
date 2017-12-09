#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.resources;

import ${package}.service.${serviceName}Service;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import static javax.ws.rs.core.Response.Status.OK;

@Path("${artifactId}/")
public class ${serviceName}Resource {

    @Inject
    private ${serviceName}Service service;

    @GET
    @Path("/")
    @Produces(MediaType.TEXT_PLAIN)
    public Response sayHello() {
        return Response.status(OK).entity("hello").build();
    }

}
