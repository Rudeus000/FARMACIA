package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Compras;
import com.examen.examen03.repository.ComprasRepositry;
@Service
public class ComprasSeviceinterface implements ComprasService {
	@Autowired
	ComprasRepositry c;
	@Override
	public Compras registrar(Compras a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public Compras actualizar(Compras a) {
		// TODO Auto-generated method stub
		return c.save(a);
	}

	@Override
	public void eliminar(Compras a) {
		// TODO Auto-generated method stub
		c.delete(a);
	}

	@Override
	public List<Compras> ver() {
		// TODO Auto-generated method stub
		return c.findAll();
	}

}
