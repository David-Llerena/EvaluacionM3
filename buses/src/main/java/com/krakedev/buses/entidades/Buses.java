package com.krakedev.buses.entidades;

public class Buses {
    private String busId;
    private int numeroBus;
    private int capacidadMaxima;


    public Buses(String busId, int numeroBus, int capacidadMaxima) {
        this.busId = busId;
        this.numeroBus = numeroBus;
        this.capacidadMaxima = capacidadMaxima;
    }

    public Buses() {}

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public int getNumeroBus() {
        return numeroBus;
    }

    public void setNumeroBus(int numeroBus) {
        this.numeroBus = numeroBus;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}