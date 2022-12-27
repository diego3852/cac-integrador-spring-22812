package com.peliculas.repositorio;


import com.peliculas.modelo.PeliculaModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PeliculaRepository extends CrudRepository<PeliculaModel, Long> {
   }
