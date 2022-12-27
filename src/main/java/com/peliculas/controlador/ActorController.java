package com.peliculas.controlador;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.peliculas.modelo.ActorModel;
import com.peliculas.modelo.PeliculaModel;
import com.peliculas.servicio.ActorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
    
    @RestController
    @RequestMapping("/actor")
    public class ActorController {
        @Autowired
        ActorService actorService;
    
        @GetMapping("/actores")
        public String verPaginadeActores(){
            return"actores";
        } 
           
               
        
     //   @GetMapping()
     //   public ArrayList<ActorModel> obtenerActores(){
     //       return actorService.obtenerActores();
     //   }
        
     //   @GetMapping("/{id}")
     //   public ResponseEntity<PeliculaModel> getPelicula(@PathVariable("id") Long id) {
     //   var pelicula = peliculaService.findById(id);
     //   return new ResponseEntity<>(pelicula, HttpStatus.OK);
    //}
         @GetMapping("/usergen/{id}")
         public ArrayList<String> byGeneroId(@PathVariable("id") Long id) {
         return actorService.obtenerActoresByGenero(id) ;
    }
        
        @PostMapping()
        public ActorModel guardarActor(@RequestBody ActorModel actor){
            return this.actorService.guardarActor(actor);
        }
    
}
    