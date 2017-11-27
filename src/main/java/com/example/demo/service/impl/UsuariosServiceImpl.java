package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import com.example.demo.service.*;
import com.example.demo.entity.Usuarios;
import com.example.demo.repository.UsuariosJpaRepository;

public class UsuariosServiceImpl implements UsuariosService {
    @Autowired
    @Qualifier("AnuncioJpaRepository")
    private UsuariosJpaRepository usuariosJpaRepository;

    @Override
    public List<Usuarios> listAllUsuarios() {
	return usuariosJpaRepository.findAll();
    }

    @Override
    public Usuarios addUsuarios(Usuarios usuarios) {
	return usuariosJpaRepository.save(usuarios);
    }
    
    @Override
    public int removeUsuarios(int id) {
	usuariosJpaRepository.delete(id);
	return 0;
    }
    
    @Override
    public Usuarios updateUsuarios(Usuarios usuarios) {
	return usuariosJpaRepository.save(usuarios);
    }
}
