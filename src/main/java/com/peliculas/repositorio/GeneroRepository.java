package com.peliculas.repositorio;

import com.peliculas.modelo.GeneroModel;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


@Repository

public interface GeneroRepository extends CrudRepository<GeneroModel, Long> {
    
    
}
