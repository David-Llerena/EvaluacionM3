package com.krakedev.buses.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;



import com.krakedev.buses.entidades.Rutas;
import com.krakedev.buses.excepciones.KrakeDevException;
import com.krakedev.buses.utils.ConexionBDD;

public class RutasBDD {

    public ArrayList<Rutas> recuperarTodos() throws KrakeDevException {
        ArrayList<Rutas> rutas = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

		
        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("select ruta_id,origen,destino,hora_salida,hora_llegada  from rutas");
            rs = ps.executeQuery();
           
            while (rs.next()) {
                Rutas ruta = new Rutas();
                ruta.setRutaId(rs.getString(1));
                ruta.setOrigen(rs.getString("origen"));
                ruta.setDestino(rs.getString("destino"));
                ruta.setHoraSalida(rs.getTime("hora_salida"));
                ruta.setHoraLlegada(rs.getTime("hora_llegada"));
                rutas.add(ruta);
            }
        }catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar: Detalle "+e.getMessage());
		}
        return rutas;
    }
}
