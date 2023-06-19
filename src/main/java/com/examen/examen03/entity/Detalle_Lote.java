package com.examen.examen03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "Detalle_Lote")
@Table(name = "detalle_lote")
public class Detalle_Lote {
	@Id
String id_detalle; 
String fechadeingreso;
int cantidad;
double precio_compra;
double porcentajede_ganacia;
double porcentajede_Descuento;
double precio_Venta;
public Detalle_Lote() {
	super();
}
public Detalle_Lote(String id_detalle, String fechadeingreso, int cantidad, double precio_compra,
		double porcentajede_ganacia, double porcentajede_Descuento, double precio_Venta) {
	super();
	this.id_detalle = id_detalle;
	this.fechadeingreso = fechadeingreso;
	this.cantidad = cantidad;
	this.precio_compra = precio_compra;
	this.porcentajede_ganacia = porcentajede_ganacia;
	this.porcentajede_Descuento = porcentajede_Descuento;
	this.precio_Venta = precio_Venta;
}

public String getId_detalle() {
	return id_detalle;
}

public void setId_detalle(String id_detalle) {
	this.id_detalle = id_detalle;
}

public String getFechadeingreso() {
	return fechadeingreso;
}

public void setFechadeingreso(String fechadeingreso) {
	this.fechadeingreso = fechadeingreso;
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

public double getPorcentajede_ganacia() {
	return porcentajede_ganacia;
}

public void setPorcentajede_ganacia(double porcentajede_ganacia) {
	this.porcentajede_ganacia = porcentajede_ganacia;
}

public double getPorcentajede_Descuento() {
	return porcentajede_Descuento;
}

public void setPorcentajede_Descuento(double porcentajede_Descuento) {
	this.porcentajede_Descuento = porcentajede_Descuento;
}

public double getPrecio_Venta() {
	return precio_Venta;
}

public void setPrecio_Venta(double precio_Venta) {
	this.precio_Venta = precio_Venta;
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
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "id_producto")
private Inventario inventario;

public Inventario getInventario() {
	return inventario;
}

public void setInventario(Inventario inventario) {
	this.inventario = inventario;
}

}
