package com.test.rest;
 
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class HelloWorldService {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
		System.out.println(output);
		return Response.status(200).entity(output).build();
 
	}
	
	@POST
	@Path("/create")
	public Response create(@QueryParam("param1") String param1, @QueryParam("param2") String param2) {
	    System.out.println("Inside Post Call : " + param1 + " : " + param2);
	    
	    int a = 5;
	    int b = 5;
	    int d = 5;
	    int c = a 
	    //test
	    + b
	    //test
+d;	
//test
	    //some changes
	    //updating changes
	    //adding new line1
	    //updating new line2
	    //updating new line3
	    return Response.status(200).build();
	    //Some new changes
	}
 
}