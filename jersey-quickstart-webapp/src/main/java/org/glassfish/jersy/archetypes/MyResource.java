package org.glassfish.jersy.archetypes;

import javax.websocket.server.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.glassfish.jersy.archetypes.Person;

import com.sun.research.ws.wadl.Response;

/*
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    @Path("person")
    @GET
    @Produces(value={MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Person getPersonDetails()
    {
    	Person p=new Person() ;
    	p.setAge(22);
    	p.setName("Neeraja");
    	return p;
    }
    /*@Path("person")
    @POST
    @Consumes
    @Produces(value={MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public Person getPersonDetails1()
    {
    	Person p=new Person() ;
    	p.setAge(22);
    	p.setName("Neeraja");
    	return p;
    }*/
    @GET
    @Path("test/{id}")
    @Produces(value={MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
    public void getSpecificPerson(@PathParam("id")String id)
    {
    	System.out.println("found the Id"+id);
    	//return Response ;
    }
}
