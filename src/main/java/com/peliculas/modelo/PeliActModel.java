package com.peliculas.modelo;
 
import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "pelicula_actor")
public class PeliActModel implements Serializable {
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)

    @Id
    private Long pel_id;
    public Long getPel_id() {
        return pel_id;
    }
    public void setPel_id(Long pel_id) {
        this.pel_id = pel_id;
    }
    public Long getAct_id() {
        return act_id;
    }
    public void setAct_id(Long act_id) {
        this.act_id = act_id;
    }
    private Long act_id;
    
    public PeliActModel(Long pel_id, Long act_id) {
        this.pel_id = pel_id;
        this.act_id = act_id;
    }
    public PeliActModel() {
    }

    
}
