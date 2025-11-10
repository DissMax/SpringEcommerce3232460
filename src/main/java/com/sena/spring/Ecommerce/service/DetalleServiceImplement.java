package com.sena.spring.Ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.DetalleOrden;
import com.example.demo.service.repository.IDetalleRepository;

@Service
public class DetalleServiceImplement implements IDetalleService {

	@Autowired
	private IDetalleRepository detalleRepository;
	
	@Override
	public DetalleOrden save(DetalleOrden detalleorden) {
		// TODO Auto-generated method stub
		return detalleRepository.save(detalleorden);
	}

}