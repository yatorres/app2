package com.distribuida.rest;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.dto.Todos;
import com.distribuida.service.TodosService;

@Path("todos")
@ApplicationScoped
public class TodosRest {

	@Inject
	private TodosService srv;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Todos> listarTodos() {
		return srv.obtenerTodos();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Todos todosPorId(@PathParam("id") Integer id) {
		return srv.obtenerTodosPorId(id);
	}
	
	@GET
	@Path(value = "/pingTodos")
	@Produces(MediaType.APPLICATION_JSON)
	public String ping() {	
		return "ok";
	}

}
