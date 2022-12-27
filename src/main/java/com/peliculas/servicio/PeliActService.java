package com.peliculas.servicio;
 
import com.peliculas.modelo.PeliActModel;
import com.peliculas.repositorio.PeliActRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class PeliActService {

    private final PeliActRepository peliActRepository;
 
   
    public PeliActModel save (final PeliActModel pelact) {
        return peliActRepository.save(pelact);
    }

    @Transactional
    public void DeleteByIdiid(Long pel_id, Long act_id) {
    this.peliActRepository.DeleteByIdID( pel_id, act_id);
   }

}
