package com.toy.springtoy.service;

import com.toy.springtoy.entities.Toy;
import com.toy.springtoy.repository.ToyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ToyServiceImpl implements ToyService{

    @Autowired
    private ToyRepository toyRepository;

    @Override
    public Toy addToy(Toy toy) {
        toyRepository.save(toy);
        return toy;
    }

    @Override
    public List<Toy> getAllToy() {
        return this.toyRepository.getAllToy();
    }

    @Override
    public Toy getToyByToyId(int toyId) {
        return this.toyRepository.getToyByToyId(toyId);
    }

    @Override
    public void removeToy(int toyId) {
        Toy toy = this.toyRepository.getToyByToyId(toyId);
        this.toyRepository.delete(toy);
    }

    @Override
    public Toy updateToy(Toy toy) {
        return this.toyRepository.save(toy);
    }
}
