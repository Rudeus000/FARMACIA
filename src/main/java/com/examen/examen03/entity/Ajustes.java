package com.examen.examen03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Ajustes")
@Table(name = "ajustes")
public class Ajustes {
	@Id
String id;
String motivo;
String fecha;
String tipo;
int cantidad;
public Ajustes() {
	super();
}
public Ajustes(String id, String motivo, String fecha, String tipo, int cantidad) {
	super();
	this.id = id;
	this.motivo = motivo;
	this.fecha = fecha;
	this.tipo = tipo;
	this.cantidad = cantidad;
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getMotivo() {
	return motivo;
}

public void setMotivo(String motivo) {
	this.motivo = motivo;
}

public String getFecha() {
	return fecha;
}

public void setFecha(String fecha) {
	this.fecha = fecha;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_inventario")
private Inventario inventario;

public Inventario getInventario() {
	return inventario;
}

public void setInventario(Inventario inventario) {
	this.inventario = inventario;
}
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_lote")
private Lotes lotes;

public Lotes getLotes() {
	return lotes;
}

public void setLotes(Lotes lotes) {
	this.lotes = lotes;
}

}
