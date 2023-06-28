package com.hello.restapi;

import com.hello.restapi.service.*;
import java.util.*;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import com.hello.restapi.userdetails.UserDetails;

@Path("/users")
public class Users {
 
	Service message=new Service();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> getUser() {
		return message.getUsers();
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public UserDetails getUser(@PathParam("id") long id) {
		
		return message.getUser(id);
	}
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserDetails addUser(UserDetails mes) {
		return message.addUser(mes);
	}
	
	@PUT
	@Path("/{message}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public UserDetails update(@PathParam("message") long id,UserDetails mess) {
		mess.setId((int) id);
		return message.update(mess);
		
	}
	@DELETE
	@Path("/{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public void remove(@PathParam("message") long id) {
		message.remove(id);
	}
}
