package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Estado_Ventas;
import com.examen.examen03.repository.Estado_VentasRepository;
@Service
public class Estado_VentasSeviceInterface implements Estado_VentasService {
	@Autowired
	Estado_VentasRepository es;
	@Override
	public Estado_Ventas registrar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		return es.save(a);
	}

	@Override
	public Estado_Ventas actualizar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		return es.save(a);
	}

	@Override
	public void eliminar(Estado_Ventas a) {
		// TODO Auto-generated method stub
		es.delete(a);
	}

	@Override
	public List<Estado_Ventas> ver() {
		// TODO Auto-generated method stub
		return es.findAll();
	}

}
