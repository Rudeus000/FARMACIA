package com.examen.examen03.service;

import java.util.List;


import com.examen.examen03.entity.BitExsistenciaInicial;

public interface BitExsistenciaInicialService {
	public BitExsistenciaInicial registrar(BitExsistenciaInicial  a);
	public BitExsistenciaInicial actualizar(BitExsistenciaInicial a);
	public void eliminar(BitExsistenciaInicial a);
	public List<BitExsistenciaInicial> ver();
}
