package com.peliculas.repositorio;
 
import com.peliculas.modelo.PeliActModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

@Repository
public interface PeliActRepository extends CrudRepository<PeliActModel, Long > {
 
    @Query(value="DELETE pelicula_actor WHERE pel_id=:pelid AND act_id=:actid", nativeQuery = true)
    public void DeleteByIdID(@Param("pelid , actid") Long pelid , Long actid );

   }
