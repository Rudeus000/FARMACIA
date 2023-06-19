package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Inventario;
import com.examen.examen03.repository.InventarioRepository;
@Service
public class inventarioServiceInterface implements InventarioService {
	@Autowired
	InventarioRepository i;
	@Override
	public Inventario registrar(Inventario a) {
		// TODO Auto-generated method stub
		return i.save(a);
	}

	@Override
	public Inventario actualizar(Inventario a) {
		// TODO Auto-generated method stub
		return i.save(a);
	}

	@Override
	public void eliminar(Inventario a) {
		// TODO Auto-generated method stub
		i.delete(a);
	}

	@Override
	public List<Inventario> ver() {
		// TODO Auto-generated method stub
		return i.findAll();
	}
	
}
