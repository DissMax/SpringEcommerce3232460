package com.example.demo.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.DetalleOrden;

@Repository
public interface IDetalleRepository extends JpaRepository<DetalleOrden, Integer>{

}
