package com.sena.spring.Ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Usuario;

public interface IUsuarioService {
	public Usuario save (Usuario usuario);
	
	public Optional <Usuario> get (Integer id);
	
	//METODOS CRUD
	public void update (Usuario usuario);
	
	public void delete (Integer id);
	
	Optional <Usuario> finById (Integer id);
	
	Optional <Usuario> finByEmail (String email);
	
	List<Usuario> findAll();

}
