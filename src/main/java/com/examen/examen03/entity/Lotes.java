package com.examen.examen03.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Lotes")
@Table(name = "lotes")
public class Lotes {
	@Id
String idLOte;
String fecha_vencimineto;
public Lotes() {
	super();
}
public Lotes(String idLOte, String fecha_vencimineto) {
	super();
	this.idLOte = idLOte;
	this.fecha_vencimineto = fecha_vencimineto;
}
public String getIdLOte() {
	return idLOte;
}
public void setIdLOte(String idLOte) {
	this.idLOte = idLOte;
}
public String getFecha_vencimineto() {
	return fecha_vencimineto;
}
public void setFecha_vencimineto(String fecha_vencimineto) {
	this.fecha_vencimineto = fecha_vencimineto;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "lotes")
List<Ajustes> x;

public List<Ajustes> getX() {
	return x;
}
public void setX(List<Ajustes> x) {
	this.x = x;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "lotes")
List<BitExsistenciaInicial> z;

public List<BitExsistenciaInicial> getZ() {
	return z;
}
public void setZ(List<BitExsistenciaInicial> z) {
	this.z = z;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "lotes")
List<Detalle_Compra> compra;

public List<Detalle_Compra> getCompra() {
	return compra;
}
public void setCompra(List<Detalle_Compra> compra) {
	this.compra = compra;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "lotes")
List<Detalle_Lote> detalle;

public List<Detalle_Lote> getDetalle() {
	return detalle;
}

public void setDetalle(List<Detalle_Lote> detalle) {
	this.detalle = detalle;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "lotes")
List<Ventas> ventas;

public List<Ventas> getVentas() {
	return ventas;
}
public void setVentas(List<Ventas> ventas) {
	this.ventas = ventas;
}

}
