package com.examen.examen03.service;

import java.util.List;

import com.examen.examen03.entity.Ajustes;



public interface AjustesService {
	
	public Ajustes registrar(Ajustes  a);
	public Ajustes actualizar(Ajustes a);
	public void eliminar(Ajustes a);
	public List<Ajustes> ver();
}
