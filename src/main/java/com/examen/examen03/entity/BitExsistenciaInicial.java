package com.examen.examen03.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name = "BitExsistenciaInicial")
@Table(name = "bitExsistenciainicial")
public class BitExsistenciaInicial {
	@Id
String idexsistenciaInicial;
int cantidad;
public BitExsistenciaInicial() {
	super();
}
public BitExsistenciaInicial(String idexsistenciaInicial, int cantidad) {
	super();
	this.idexsistenciaInicial = idexsistenciaInicial;
	this.cantidad = cantidad;
}

public String getIdexsistenciaInicial() {
	return idexsistenciaInicial;
}

public void setIdexsistenciaInicial(String idexsistenciaInicial) {
	this.idexsistenciaInicial = idexsistenciaInicial;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}
@ManyToOne (fetch = FetchType.LAZY)
@JoinColumn(name = "id_inventario")
private Inventario bit;

public Inventario getBit() {
	return bit;
}

public void setBit(Inventario bit) {
	this.bit = bit;
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
