package com.peliculas.modelo;

import java.io.Serializable;
import java.time.LocalDate;
import static java.time.temporal.WeekFields.ISO;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.JoinColumn;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "pelicula")

public class PeliculaModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include()
    @Column(name = "pel_id")  
    private Long pel_id;
    private String pel_titulo;
    private Date pel_fecha_estreno;
    private String pel_pais;
    private String pel_director;
    private Long gen_id;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "pelicula_actor",
            joinColumns = @JoinColumn(name = "pel_id"),
            inverseJoinColumns = @JoinColumn(name = "act_id")
    )
    private List<ActorModel> actores = new ArrayList<>();

    public PeliculaModel(Long pel_id, String pel_titulo, Date pel_fecha_estreno, String pel_pais,
            String pel_director, Long gen_id, List<ActorModel> actores) {
        this.pel_id = pel_id;
        this.pel_titulo = pel_titulo;
        this.pel_fecha_estreno = pel_fecha_estreno;
        this.pel_pais = pel_pais;
        this.pel_director = pel_director;
        this.gen_id = gen_id;
        this.actores = actores;
    }
    public void addActor(ActorModel actor) {
        actores.add(actor);
        actor.getPeliculas().add(this);
    }
    public void removeActor(ActorModel actor) {
        actores.remove(actor);
        actor.getPeliculas().remove(this);
    }

}

