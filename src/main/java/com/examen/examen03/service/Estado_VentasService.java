package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Estado_Ventas;

public interface Estado_VentasService {
	public Estado_Ventas registrar(Estado_Ventas  a);
	public Estado_Ventas actualizar(Estado_Ventas a);
	public void eliminar(Estado_Ventas a);
	public List<Estado_Ventas> ver();
}
