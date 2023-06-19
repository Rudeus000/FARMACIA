package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Compras;

public interface ComprasService {
	public Compras registrar(Compras  a);
	public Compras actualizar(Compras a);
	public void eliminar(Compras a);
	public List<Compras> ver();
}
