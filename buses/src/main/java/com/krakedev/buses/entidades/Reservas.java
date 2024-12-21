package com.krakedev.buses.entidades;

public class Reservas {
    private String reservaId;
    private String usuarioId;
    private String rutaId;
    private String busId;
    
    private Usuarios usuarios;
    private Rutas rutas;
    private Buses bus;

    public Reservas(String reservaId, String usuarioId, String rutaId, String busId) {
        this.reservaId = reservaId;
        this.usuarioId = usuarioId;
        this.rutaId = rutaId;
        this.busId = busId;
    }

    public Reservas() {}

    // Getters y Setters
    public String getReservaId() {
        return reservaId;
    }

    public void setReservaId(String reservaId) {
        this.reservaId = reservaId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getRutaId() {
        return rutaId;
    }

    public void setRutaId(String rutaId) {
        this.rutaId = rutaId;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public Usuarios getUsuario() {
        return usuarios;
    }

    public void setUsuario(Usuarios usuario) {
        this.usuarios = usuario;
    }

    public Rutas getRuta() {
        return rutas;
    }

    public void setRuta(Rutas ruta) {
        this.rutas = ruta;
    }

    public Buses getBus() {
        return bus;
    }

    public void setBus(Buses bus) {
        this.bus = bus;
    }
}