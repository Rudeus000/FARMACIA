package com.examen.examen03.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Estado_Ventas")
@Table(name = "estado_ventas")
public class Estado_Ventas {
	@Id
String idEstadoVenta;
String Descripcion;
public Estado_Ventas() {
	super();
}
public Estado_Ventas(String idEstadoVenta, String descripcion) {
	super();
	this.idEstadoVenta = idEstadoVenta;
	Descripcion = descripcion;
}
public String getIdEstadoVenta() {
	return idEstadoVenta;
}
public void setIdEstadoVenta(String idEstadoVenta) {
	this.idEstadoVenta = idEstadoVenta;
}
public String getDescripcion() {
	return Descripcion;
}
public void setDescripcion(String descripcion) {
	Descripcion = descripcion;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "estado")
List<Ventas> x;
}
