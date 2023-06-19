package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Devoluciones;

public interface DevolucionesService {
	public Devoluciones registrar(Devoluciones  a);
	public Devoluciones actualizar(Devoluciones a);
	public void eliminar(Devoluciones a);
	public List<Devoluciones> ver();
}
