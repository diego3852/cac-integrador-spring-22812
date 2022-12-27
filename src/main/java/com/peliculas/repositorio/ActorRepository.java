package com.peliculas.repositorio;

import com.peliculas.modelo.PeliActModel;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.peliculas.modelo.ActorModel;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface ActorRepository extends CrudRepository<ActorModel, Long> {

 //    @Query(value="DELETE pelicula_actor WHERE pel_id=:pelid AND act_id=:actid", nativeQuery = true)
 //   public void DeleteByIdID(@Param("pelid , actid") Long pelid , Long actid );
  
      @Query(value="SELECT CONCAT(a.act_nombre, ' ',a.act_apellido) full_name FROM actor a, pelicula p, actpel ap, genero g WHERE g.gen_id=:genid AND g.gen_id = ´.gen_id AND p.pel_id = ap.pel_id AND ap.act_id = a.act_id ORDER BY a.act_apellido, a.act_nombreien",nativeQuery=true)
    public List<String> actoresPorGenero(@Param("genid") Long genid);
    
    
    
}
