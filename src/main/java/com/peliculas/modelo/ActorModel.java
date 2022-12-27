 package com.peliculas.modelo;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Getter
@Setter
@Entity
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Table(name = "actor")
public class ActorModel implements Serializable {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Include()

    private Long act_id;
    private String act_nombre;
    private String act_apellido;
    private String act_nacionalidad;
    private int act_edad;
    
    @ManyToMany(mappedBy = "actores")
    public List<PeliculaModel> peliculas = new ArrayList<>();


}
