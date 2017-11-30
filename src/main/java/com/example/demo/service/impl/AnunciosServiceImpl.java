package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

import com.example.demo.entity.Anuncios;
import com.example.demo.repository.AnunciosJpaRepository;
import com.example.demo.service.AnunciosService;

import com.example.demo.service.AnunciosService;

public class AnunciosServiceImpl implements AnunciosService {
    @Autowired
    @Qualifier("AnuncioJpaRepository")
    private AnunciosJpaRepository anunciosJpaRepository;

    @Override
    public List<Anuncios> listAllAnuncios() {
	return anunciosJpaRepository.findAll();
    }

    @Override
    public Anuncios addAnuncios(Anuncios anuncios) {
	return anunciosJpaRepository.save(anuncios);
    }
    
    @Override
    public int removeAnuncios(int id) {
	anunciosJpaRepository.delete(id);
	return 0;
    }
    
    @Override
    public Anuncios updateAnuncios(Anuncios anuncios) {
	return anunciosJpaRepository.save(anuncios);
    }
}
