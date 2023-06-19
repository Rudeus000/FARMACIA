package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Detalle_Compra;
import com.examen.examen03.repository.Detalle_CompraRepository;
@Service
public class Detalle_CompraServiceInterface implements Detalle_CompraService {
	@Autowired 
	Detalle_CompraRepository dc;
	@Override
	public Detalle_Compra registrar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		return dc.save(a);
	}

	@Override
	public Detalle_Compra actualizar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		return dc.save(a);
	}

	@Override
	public void eliminar(Detalle_Compra a) {
		// TODO Auto-generated method stub
		dc.delete(a);
	}

	@Override
	public List<Detalle_Compra> ver() {
		// TODO Auto-generated method stub
		return dc.findAll();
	}

}
