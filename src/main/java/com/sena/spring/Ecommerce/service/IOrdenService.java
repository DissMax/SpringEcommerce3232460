package com.sena.spring.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Orden;
import com.example.demo.model.Usuario;

public interface IOrdenService {
	
	public Orden save (Orden orden);
	
	public List<Orden> findAll ();
	
	public List<Orden> findByUsuario (Usuario usuario);
	
	public Optional<Orden> findById (Integer id);
	
	public String generarOrdenFactura ();

}
