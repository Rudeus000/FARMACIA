package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Ventas;
import com.examen.examen03.repository.VentasRepository;
@Service
public class VenetasServiceInterface implements VentasService {
	@Autowired
	VentasRepository v;
	@Override
	public Ventas registrar(Ventas a) {
		// TODO Auto-generated method stub
		return v.save(a);
	}

	@Override
	public Ventas actualizar(Ventas a) {
		// TODO Auto-generated method stub
		return v.save(a);
	}

	@Override
	public void eliminar(Ventas a) {
		// TODO Auto-generated method stub
		v.delete(a);
	}

	@Override
	public List<Ventas> ver() {
		// TODO Auto-generated method stub
		return v.findAll();
	}

}
