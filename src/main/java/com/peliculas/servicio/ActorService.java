package com.peliculas.servicio;

import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.peliculas.modelo.ActorModel;
import com.peliculas.repositorio.ActorRepository;

@Service
public class ActorService {
    @Autowired
    ActorRepository actorRepository;
    
    public ArrayList<ActorModel> obtenerActores(){
       return(ArrayList<ActorModel>) actorRepository.findAll();
    }
     
    public ArrayList<String> obtenerActoresByGenero(Long id){
      return(ArrayList<String>) actorRepository.actoresPorGenero(id);
    }
    
    public ActorModel guardarActor(ActorModel actor){
        return actorRepository.save(actor);
    }

    public void DeleteById(Long id) {
        Optional<ActorModel> optionalActorModel = this.actorRepository.findById(id);
        if (optionalActorModel.isEmpty()) {
           // throw new ToDoExceptions( message "Actor no enfontrado", HttpStatus.NOT_FOUND);
        }
        this.actorRepository.deleteById(id);
    }
}


