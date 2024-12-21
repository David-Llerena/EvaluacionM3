package com.krakedev.buses.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import com.krakedev.buses.excepciones.KrakeDevException;

public class ConexionBDD {
	public static Connection obtenerConexion() throws KrakeDevException{
		Context ctx = null;
		DataSource ds = null;
		Connection con = null;
		try {
			ctx = new InitialContext();
			//JNDI 
			ds = (DataSource) ctx.lookup("java:/comp/env/jdbc/ConexionBuses");
			con = ds.getConnection();
		} catch (NamingException | SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error de Conexion");
		}
		return con;
	}
}