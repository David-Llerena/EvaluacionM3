package com.krakedev.buses.servicios;

import java.util.ArrayList;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.buses.bdd.BusesBDD;
import com.krakedev.buses.entidades.Buses;
import com.krakedev.buses.excepciones.KrakeDevException;


@Path("bus")
public class ServiciosBus {

	@Path("todas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response recuperarTodas() {
		BusesBDD busesRes = new BusesBDD();
		ArrayList<Buses> buses = null;
		try {
			buses = busesRes.recuperarTodos();
			return Response.ok(buses).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}