package com.krakedev.buses.entidades;

import java.sql.Time;

public class Rutas {
 private String rutaId;
 private String origen;
 private String destino;
 private Time horaSalida;
 private Time horaLlegada;


 public Rutas(String rutaId, String origen, String destino, Time horaSalida, Time horaLlegada) {
     this.rutaId = rutaId;
     this.origen = origen;
     this.destino = destino;
     this.horaSalida = horaSalida;
     this.horaLlegada = horaLlegada;
 }


 public Rutas() {}


 public String getRutaId() {
     return rutaId;
 }

 public void setRutaId(String rutaId) {
     this.rutaId = rutaId;
 }

 public String getOrigen() {
     return origen;
 }

 public void setOrigen(String origen) {
     this.origen = origen;
 }

 public String getDestino() {
     return destino;
 }

 public void setDestino(String destino) {
     this.destino = destino;
 }

 public Time getHoraSalida() {
     return horaSalida;
 }

 public void setHoraSalida(Time time) {
     this.horaSalida = time;
 }

 public Time getHoraLlegada() {
     return horaLlegada;
 }

 public void setHoraLlegada(Time horaLlegada) {
     this.horaLlegada = horaLlegada;
 }


}