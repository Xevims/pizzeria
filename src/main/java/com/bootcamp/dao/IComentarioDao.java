package com.bootcamp.dao;

import com.bootcamp.entities.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IComentarioDao extends JpaRepository<Comentario, Long> {

}
