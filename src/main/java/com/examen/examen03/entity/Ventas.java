package com.examen.examen03.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity(name = "Ventas")
@Table(name = "ventas")
public class Ventas {
	@Id
	String idventa;
	String id_empleado;
	String hora;
	String fecha;
	int cantidad;
	int precio;
	double Descuento;
	double total_importe;
	public Ventas() {
		super();
	}
	public Ventas( String idventa, String id_empleado, String hora, String fecha,
			int cantidad, int precio, double descuento, double total_importe) {
		super();
		this.idventa = idventa;
		this.id_empleado = id_empleado;
		this.hora = hora;
		this.fecha = fecha;
		this.cantidad = cantidad;
		this.precio = precio;
		Descuento = descuento;
		this.total_importe = total_importe;
	}
	public String getIdventa() {
		return idventa;
	}
	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}
	public String getId_empleado() {
		return id_empleado;
	}
	public void setId_empleado(String id_empleado) {
		this.id_empleado = id_empleado;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
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
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public double getDescuento() {
		return Descuento;
	}
	public void setDescuento(double descuento) {
		Descuento = descuento;
	}
	public double getTotal_importe() {
		return total_importe;
	}
	public void setTotal_importe(double total_importe) {
		this.total_importe = total_importe;
	}
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "ventas")
	List<Devoluciones> x;
	
	public List<Devoluciones> getX() {
		return x;
	}
	public void setX(List<Devoluciones> x) {
		this.x = x;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idEstado")
	private Estado_Ventas estado;
	
	public Estado_Ventas getEstado() {
		return estado;
	}
	public void setEstado(Estado_Ventas estado) {
		this.estado = estado;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProducto")
	private Inventario inventario;
	
	public Inventario getInventario() {
		return inventario;
	}
	public void setInventario(Inventario inventario) {
		this.inventario = inventario;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idLotes")
	private Lotes lotes;
	
	public Lotes getLotes() {
		return lotes;
	}
	public void setLotes(Lotes lotes) {
		this.lotes = lotes;
	}
	
}
