package com.example.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuarios;

@Repository("usuarioJpaRepository")
public interface UsuariosJpaRepository extends JpaRepository<Usuarios, Serializable>{
	
    public abstract Usuarios findById(Integer id);
 
}
