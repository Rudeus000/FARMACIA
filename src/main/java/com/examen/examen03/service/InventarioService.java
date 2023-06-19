package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Inventario;

public interface InventarioService {
	public Inventario registrar(Inventario  a);
	public Inventario actualizar(Inventario a);
	public void eliminar(Inventario a);
	public List<Inventario> ver();
}
