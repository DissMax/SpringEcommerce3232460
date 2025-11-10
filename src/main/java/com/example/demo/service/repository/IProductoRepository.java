package com.example.demo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Producto;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Integer>{
	
}
