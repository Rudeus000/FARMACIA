package com.examen.examen03.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examen.examen03.entity.BitExsistenciaInicial;
import com.examen.examen03.service.BitExsistenciaInicialService;
@RestController
@RequestMapping("/Existencial")
public class BitExsistenciaInicialController {
	@Autowired
	BitExsistenciaInicialService x;
	
	@PostMapping
	public BitExsistenciaInicial guardar (@RequestBody BitExsistenciaInicial a) {
		return x.registrar(a);
	}
	@PutMapping
	public BitExsistenciaInicial actualizar   (@RequestBody BitExsistenciaInicial a) {
		return x.actualizar(a);
}
	@DeleteMapping
	public void eleminar (@RequestBody BitExsistenciaInicial a) {
		x.eliminar(a);
	}
	@GetMapping
	public List<BitExsistenciaInicial> verc(){
		return x.ver();
	}
}
