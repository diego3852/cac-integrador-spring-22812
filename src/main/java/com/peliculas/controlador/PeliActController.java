package com.peliculas.controlador;
 
import com.peliculas.servicio.PeliActService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.var;


@RestController
    @RequestMapping("/peliact")
        public class PeliActController {
    
        @Autowired
        PeliActService peliActService;
/*
        @PostMapping()
        public ResponseEntity<PeliActModel> savePelicula(@RequestBody PeliActModel pelact) {
            var peliactSaved = peliactService.save(pelact);
            return new ResponseEntity<>(peliactSaved, HttpStatus.OK);
        }
*/

        @PatchMapping("/deletepeliact/{pelid}/{actid}")
        public ResponseEntity<Void> deleteByidID(@PathVariable("pelid") Long pel_id, @PathVariable("actid") Long act_id ) {
            this.peliActService.DeleteByIdiid(pel_id, act_id);
            return ResponseEntity.noContent().build();
        }     

}
