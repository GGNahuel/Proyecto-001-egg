package com.club.Club.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.club.Club.entidades.Clase;
@Repository
public interface ClaseRepositorio  extends JpaRepository<Clase,Long>{
    
}