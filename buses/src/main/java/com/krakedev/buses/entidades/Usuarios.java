package com.krakedev.buses.entidades;

public class Usuarios {
    private String usuarioId;
    private String nombre;
    private String correoElectronico;

    public Usuarios(String usuarioId, String nombre, String correoElectronico) {
        this.usuarioId = usuarioId;
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
    }

    public Usuarios() {}

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}