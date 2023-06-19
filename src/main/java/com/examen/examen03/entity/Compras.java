package com.examen.examen03.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Compras")
@Table(name = "compras")
public class Compras {
	@Id
String idcompra;
String id_proveedor;
String no_factura;
String fecha;
public Compras() {
	super();
}
public Compras(String idcompra, String id_proveedor, String no_factura, String fecha) {
	super();
	this.idcompra = idcompra;
	this.id_proveedor = id_proveedor;
	this.no_factura = no_factura;
	this.fecha = fecha;
}
public String getIdcompra() {
	return idcompra;
}
public void setIdcompra(String idcompra) {
	this.idcompra = idcompra;
}
public String getId_proveedor() {
	return id_proveedor;
}
public void setId_proveedor(String id_proveedor) {
	this.id_proveedor = id_proveedor;
}
public String getNo_factura() {
	return no_factura;
}
public void setNo_factura(String no_factura) {
	this.no_factura = no_factura;
}
public String getFecha() {
	return fecha;
}
public void setFecha(String fecha) {
	this.fecha = fecha;
}
@OneToMany(fetch = FetchType.LAZY,mappedBy = "compras")
List<Detalle_Compra> x;

public List<Detalle_Compra> getX() {
	return x;
}

public void setX(List<Detalle_Compra> x) {
	this.x = x;
}

}
