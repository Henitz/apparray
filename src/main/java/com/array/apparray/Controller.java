package com.array.apparray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping
public class Controller {

    @Autowired
    Repository repository;

    @GetMapping
    public MyEntity myMethod(@RequestBody MyEntity input) {
        for (Fora i: input.getValores_um()) {
            System.out.println("Posso usar cada valor_um: " + i.getX());
        }
        return repository.save(input);
    }


}
