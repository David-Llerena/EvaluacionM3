package com.krakedev.buses.servicios;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.buses.bdd.RutasBDD;
import com.krakedev.buses.entidades.Rutas;
import com.krakedev.buses.excepciones.KrakeDevException;

@Path("rutas")
public class ServiciosRutas {

	@Path("todas")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response recuperarTodas() {
		RutasBDD rutasRes = new RutasBDD();
		ArrayList<Rutas> rutas = null;
		try {
			rutas = rutasRes.recuperarTodos();
			return Response.ok(rutas).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}