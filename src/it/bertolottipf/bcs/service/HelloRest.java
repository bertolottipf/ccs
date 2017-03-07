package it.bertolottipf.bcs.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class HelloRest {
	
	@Path("/hello/{world}")
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String hello(
			@PathParam("world") String text,
			@QueryParam("nome") String nome
			){
		return "Hello "+text+" "+nome+"!";
	}
	
}
