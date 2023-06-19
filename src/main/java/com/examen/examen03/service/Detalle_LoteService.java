package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Detalle_Lote;

public interface Detalle_LoteService {
	public Detalle_Lote registrar(Detalle_Lote  a);
	public Detalle_Lote actualizar(Detalle_Lote a);
	public void eliminar(Detalle_Lote a);
	public List<Detalle_Lote> ver();
}
