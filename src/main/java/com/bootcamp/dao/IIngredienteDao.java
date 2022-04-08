package com.bootcamp.dao;

import com.bootcamp.entities.Ingrediente;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IIngredienteDao extends JpaRepository<Ingrediente, Long> {

}
