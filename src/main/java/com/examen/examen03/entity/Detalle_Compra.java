package com.examen.examen03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Detalle_Compra")
@Table(name = "detalle_compra")
public class Detalle_Compra {
	@Id

String detalles_compra;
int cantidad;
double precio_compra;
public Detalle_Compra() {
	super();
}

public Detalle_Compra(String detalles_compra, int cantidad, double precio_compra, Lotes lotes) {
	super();
	this.detalles_compra = detalles_compra;
	this.cantidad = cantidad;
	this.precio_compra = precio_compra;
	this.lotes = lotes;
}


public String getDetalles_compra() {
	return detalles_compra;
}


public void setDetalles_compra(String detalles_compra) {
	this.detalles_compra = detalles_compra;
}


public int getCantidad() {
	return cantidad;
}


public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}


public double getPrecio_compra() {
	return precio_compra;
}


public void setPrecio_compra(double precio_compra) {
	this.precio_compra = precio_compra;
}


public Lotes getLotes() {
	return lotes;
}


public void setLotes(Lotes lotes) {
	this.lotes = lotes;
}

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idlote")
private Lotes lotes;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idproducto")
private Inventario inventario;

public Inventario getInventario() {
	return inventario;
}

public void setInventario(Inventario inventario) {
	this.inventario = inventario;
}

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "idcompra")
private Compras compras;

public Compras getCompras() {
	return compras;
}


public void setCompras(Compras compras) {
	this.compras = compras;
}


}
