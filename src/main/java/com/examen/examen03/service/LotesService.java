package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Lotes;

public interface LotesService {
	public Lotes registrar(Lotes a);
	public Lotes actualizar(Lotes a);
	public void eliminar(Lotes a);
	public List<Lotes> ver();
}
