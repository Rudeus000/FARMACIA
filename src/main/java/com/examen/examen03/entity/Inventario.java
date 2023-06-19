package com.examen.examen03.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Inventario")
@Table(name = "inventario")
public class Inventario {
	@Id
String idProducto;
String nombre;
String idLaboratorio;
String Presentacion;
String concentracion;
String Idpresentcion;
String Existencia_minima;
public Inventario(String idProducto, String nombre, String idLaboratorio, String presentacion, String concentracion,
		String idpresentcion, String existencia_minima) {
	super();
	this.idProducto = idProducto;
	this.nombre = nombre;
	this.idLaboratorio = idLaboratorio;
	Presentacion = presentacion;
	this.concentracion = concentracion;
	Idpresentcion = idpresentcion;
	Existencia_minima = existencia_minima;
}
public Inventario() {
	super();
}
public String getIdProducto() {
	return idProducto;
}
public void setIdProducto(String idProducto) {
	this.idProducto = idProducto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getIdLaboratorio() {
	return idLaboratorio;
}
public void setIdLaboratorio(String idLaboratorio) {
	this.idLaboratorio = idLaboratorio;
}
public String getPresentacion() {
	return Presentacion;
}
public void setPresentacion(String presentacion) {
	Presentacion = presentacion;
}
public String getConcentracion() {
	return concentracion;
}
public void setConcentracion(String concentracion) {
	this.concentracion = concentracion;
}
public String getIdpresentcion() {
	return Idpresentcion;
}
public void setIdpresentcion(String idpresentcion) {
	Idpresentcion = idpresentcion;
}
public String getExistencia_minima() {
	return Existencia_minima;
}
public void setExistencia_minima(String existencia_minima) {
	Existencia_minima = existencia_minima;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "inventario") 
List<Ajustes> x;

public List<Ajustes> getX() {
	return x;
}

public void setX(List<Ajustes> x) {
	this.x = x;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "bit")
List<BitExsistenciaInicial> z;

public List<BitExsistenciaInicial> getZ() {
	return z;
}
public void setZ(List<BitExsistenciaInicial> z) {
	this.z = z;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "inventario")
List<Detalle_Lote> detalle;

public List<Detalle_Lote> getDetalle() {
	return detalle;
}
public void setDetalle(List<Detalle_Lote> detalle) {
	this.detalle = detalle;
}

@OneToMany(fetch = FetchType.LAZY,mappedBy = "inventario")
List<Detalle_Compra> detallecom;

public List<Detalle_Compra> getDetallecom() {
	return detallecom;
}
public void setDetallecom(List<Detalle_Compra> detallecom) {
	this.detallecom = detallecom;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "inventario")
List<Ventas> ventas;

public List<Ventas> getVentas() {
	return ventas;
}
public void setVentas(List<Ventas> ventas) {
	this.ventas = ventas;
}

}
