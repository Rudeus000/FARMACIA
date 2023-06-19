package com.examen.examen03.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examen.examen03.entity.Lotes;
import com.examen.examen03.repository.LotesRepositry;
@Service
public class LotesServiceinterface  implements LotesService{
	@Autowired
	LotesRepositry l;
	@Override
	public Lotes registrar(Lotes a) {
		// TODO Auto-generated method stub
		return l.save(a);
	}

	@Override
	public Lotes actualizar(Lotes a) {
		// TODO Auto-generated method stub
		return l.save(a);
	}

	@Override
	public void eliminar(Lotes a) {
		// TODO Auto-generated method stub
		l.delete(a);
	}

	@Override
	public List<Lotes> ver() {
		// TODO Auto-generated method stub
		return l.findAll();
	}
		
}
