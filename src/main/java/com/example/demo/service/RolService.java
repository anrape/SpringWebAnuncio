package com.example.demo.service;

import com.example.demo.entity.Rol;
import java.util.List;

public interface RolService {
    public abstract Rol addRol(Rol rol) ;
    public abstract List<Rol> listAllRol();
    public abstract int removeRol(int id);
    public abstract Rol updateRol(Rol rol);
}
