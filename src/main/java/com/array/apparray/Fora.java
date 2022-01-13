package com.array.apparray;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Fora {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany(cascade=CascadeType.PERSIST)
    @JoinColumn(name="fora_x")
    private List<Dentro> x;


    public List<Dentro> getX() {
        return x;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setX(List<Dentro> x) {
        this.x = x;
    }
}
