package com.example.demo.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Rol;

@Repository("rolJpaRepository")
public interface RolJpaRepository extends JpaRepository<Rol, Serializable> {

    public abstract Rol findById(Integer rolId);
    //    public abstract List<Rol> findByPermission(Integer maxPerm);
    
}
