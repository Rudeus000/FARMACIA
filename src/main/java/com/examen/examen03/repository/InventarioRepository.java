package com.examen.examen03.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examen.examen03.entity.Inventario;

public interface InventarioRepository extends JpaRepository<Inventario, String> {

}
