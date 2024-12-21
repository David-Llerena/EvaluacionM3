package com.krakedev.buses.bdd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.krakedev.buses.entidades.Buses;
import com.krakedev.buses.excepciones.KrakeDevException;
import com.krakedev.buses.utils.ConexionBDD;

public class BusesBDD {

    public ArrayList<Buses> recuperarTodos() throws KrakeDevException {
        ArrayList<Buses> buses = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            con = ConexionBDD.obtenerConexion();
            ps = con.prepareStatement("SELECT bus_id, numero_bus, capacidad_maxima FROM buses");
            rs = ps.executeQuery();
            while (rs.next()) {
                Buses bus = new Buses();
                bus.setBusId(rs.getString("bus_id"));
                bus.setNumeroBus(rs.getInt("numero_bus"));
                bus.setCapacidadMaxima(rs.getInt("capacidad_maxima"));
                buses.add(bus);
            }
        }catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al consultar: Detalle "+e.getMessage());
		}
        return buses;
    }
}