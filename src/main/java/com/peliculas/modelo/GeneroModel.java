package com.peliculas.modelo;

import java.io.Serializable;
import javax.persistence.*;

//@Entity
@Table(name = "genero")

public class GeneroModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    private Long gen_id;
    private String gen_nombre;
   
    public Long getGen_id() {
        return gen_id;
    }
    public void setGen_id(Long gen_id) {
        this.gen_id = gen_id;
    }
    public String getGen_nombre() {
        return gen_nombre;
    }
    public void setGen_nombre(String gen_nombre) {
        this.gen_nombre = gen_nombre;
    }
   
  //  }
    public GeneroModel(Long gen_id, String gen_nombre) {
        this.gen_id = gen_id;
        this.gen_nombre = gen_nombre;
   
    }
    public GeneroModel(String gen_nombre) {
        this.gen_nombre = gen_nombre;
    }
    public GeneroModel() {
    }



    
}



