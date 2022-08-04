package com.toy.springtoy.service;

import com.toy.springtoy.entities.Toy;

import java.util.List;

public interface ToyService {

    public  Toy addToy(Toy toy);
    public List<Toy> getAllToy();

    public Toy getToyByToyId(int toyId);

    public void removeToy(int toyId);

    public Toy updateToy(Toy toy);
}
