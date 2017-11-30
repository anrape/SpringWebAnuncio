package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Anuncios;

@Repository("anunciosJpaRepository")
public interface AnunciosJpaRepository extends JpaRepository<Anuncios, Serializable> {
    public abstract Anuncios findById(int id);
    public abstract List<Anuncios> findByTitulo(String[] Title);
}
