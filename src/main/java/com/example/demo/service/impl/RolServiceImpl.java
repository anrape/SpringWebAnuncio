package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import com.example.demo.entity.Rol;
import com.example.demo.repository.RolJpaRepository;

import com.example.demo.service.RolService;

public class RolServiceImpl implements RolService {
    @Autowired
    @Qualifier("RolJpaRepository")
    private RolJpaRepository rolJpaRepository;

    @Override
    public List<Rol> listAllRol() {
	return rolJpaRepository.findAll();
    }

    @Override
    public Rol addRol(Rol rol) {
	return rolJpaRepository.save(rol);
    }

    @Override
    public int removeRol(int id) {
	rolJpaRepository.delete(id);
	return 0;
    }

    @Override
    public Rol updateRol(Rol rol) {
	return rolJpaRepository.save(rol);
    }
}
