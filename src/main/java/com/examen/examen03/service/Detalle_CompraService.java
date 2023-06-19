package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.Detalle_Compra;

public interface Detalle_CompraService {
	public Detalle_Compra registrar(Detalle_Compra  a);
	public Detalle_Compra actualizar(Detalle_Compra a);
	public void eliminar(Detalle_Compra a);
	public List<Detalle_Compra> ver();
}
