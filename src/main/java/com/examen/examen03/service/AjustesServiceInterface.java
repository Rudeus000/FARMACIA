package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Ajustes;
import com.examen.examen03.repository.AjustesRepositry;
@Service
public class AjustesServiceInterface implements AjustesService{
@Autowired
	AjustesRepositry x;
	@Override
	public Ajustes registrar(Ajustes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Ajustes actualizar(Ajustes a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Ajustes a) {
		// TODO Auto-generated method stub
		x.delete(a);
	}

	@Override
	public List<Ajustes> ver() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
