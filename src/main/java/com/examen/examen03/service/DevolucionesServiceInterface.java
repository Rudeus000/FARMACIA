package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Devoluciones;
import com.examen.examen03.repository.DevolucionesRepositry;
@Service
public class DevolucionesServiceInterface implements DevolucionesService{
	@Autowired
	DevolucionesRepositry d;
	@Override
	public Devoluciones registrar(Devoluciones a) {
		// TODO Auto-generated method stub
		return d.save(a);
	}

	@Override
	public Devoluciones actualizar(Devoluciones a) {
		// TODO Auto-generated method stub
		return d.save(a);
	}

	@Override
	public void eliminar(Devoluciones a) {
		// TODO Auto-generated method stub
		d.delete(a);
	}

	@Override
	public List<Devoluciones> ver() {
		// TODO Auto-generated method stub
		return d.findAll();
	}

}
