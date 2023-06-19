package com.examen.examen03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Devoluciones")
@Table(name = "devoluciones")
public class Devoluciones {
	@Id
String id_devolucion;
String fecha;
int cantidad;
public Devoluciones(String id_devolucion, String fecha, int cantidad) {
	super();
	this.id_devolucion = id_devolucion;

	this.fecha = fecha;
	this.cantidad = cantidad;
}
public Devoluciones() {
	super();
}
public String getId_devolucion() {
	return id_devolucion;
}
public void setId_devolucion(String id_devolucion) {
	this.id_devolucion = id_devolucion;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idVenta")
private Ventas ventas;

public Ventas getVentas() {
	return ventas;
}
public void setVentas(Ventas ventas) {
	this.ventas = ventas;
}

}
