package com.array.apparray;

import javax.persistence.*;
import java.util.List;

@Entity
public class Dentro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //private List<MyEntity> myEntities;
    @OneToMany(cascade= CascadeType.PERSIST)
    @JoinColumn(name="inteiro_dentro")
    //@OneToMany(mappedBy = "myentity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Dentro> dentros;

    public List<Dentro> getDentros() {
        return dentros;
    }

    public void setDentros(List<Dentro> dentros) {
        this.dentros = dentros;
    }

    private Integer inteiro;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInteiro() {
        return inteiro;
    }

    public void setInteiro(Integer inteiro) {
        this.inteiro = inteiro;
    }
}
