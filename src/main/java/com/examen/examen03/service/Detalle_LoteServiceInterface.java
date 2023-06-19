package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Detalle_Lote;
import com.examen.examen03.repository.Detalle_LoteRepository;
@Service
public class Detalle_LoteServiceInterface implements Detalle_LoteService{
	@Autowired
	Detalle_LoteRepository dr;
	@Override
	public Detalle_Lote registrar(Detalle_Lote a) {
		// TODO Auto-generated method stub
		return dr.save(a);
	}

	@Override
	public Detalle_Lote actualizar(Detalle_Lote a) {
		// TODO Auto-generated method stub
		return dr.save(a);
	}

	@Override
	public void eliminar(Detalle_Lote a) {
		// TODO Auto-generated method stub
		dr.delete(a);
	}

	@Override
	public List<Detalle_Lote> ver() {
		// TODO Auto-generated method stub
		return dr.findAll();
	}

}
