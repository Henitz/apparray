package com.array.apparray;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class MyEntity {
        MyEntity(){ }
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        public MyEntity(MyEntity input) {
                this.valores_um = input.getValores_um();
                this.valores_dois = input.getValores_dois();
        }

        @OneToMany(cascade=CascadeType.PERSIST)
        @JoinColumn(name="myEntity_valores_um")
        //@OneToMany(mappedBy = "myentity", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Fora> valores_um;

        @OneToMany(cascade=CascadeType.PERSIST)
        @JoinColumn(name="myEntity_valores_dois")
        //@OneToMany(mappedBy = "myentity", cascade = CascadeType.ALL, orphanRemoval = true)
        private List<Fora> valores_dois;

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public List<Fora> getValores_um() {
                return valores_um;
        }

        public void setValores_um(List<Fora> valores_um) {
                this.valores_um = valores_um;
        }

        public List<Fora> getValores_dois() {
                return valores_dois;
        }

        public void setValores_dois(List<Fora> valores_dois) {
                this.valores_dois = valores_dois;
        }
}