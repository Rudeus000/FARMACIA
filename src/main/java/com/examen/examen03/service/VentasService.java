package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Ventas;

public interface VentasService {
	public Ventas registrar(Ventas  a);
	public Ventas actualizar(Ventas a);
	public void eliminar(Ventas a);
	public List<Ventas> ver();
}
