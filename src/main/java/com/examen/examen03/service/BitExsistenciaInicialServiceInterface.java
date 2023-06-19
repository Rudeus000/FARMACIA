package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.BitExsistenciaInicial;
import com.examen.examen03.repository.BitExsistenciaInicialRepository;

@Service
public class BitExsistenciaInicialServiceInterface  implements BitExsistenciaInicialService{
	@Autowired
	BitExsistenciaInicialRepository b;
	@Override
	public BitExsistenciaInicial registrar(BitExsistenciaInicial a) {
		// TODO Auto-generated method stub
		return b.save(a);
	}

	@Override
	public BitExsistenciaInicial actualizar(BitExsistenciaInicial a) {
		// TODO Auto-generated method stub
		return b.save(a);
	}

	@Override
	public void eliminar(BitExsistenciaInicial a) {
		// TODO Auto-generated method stub
		b.delete(a);
	}

	@Override
	public List<BitExsistenciaInicial> ver() {
		// TODO Auto-generated method stub
		return b.findAll();
	}

}
