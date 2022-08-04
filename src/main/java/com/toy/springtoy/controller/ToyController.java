package com.toy.springtoy.controller;

import com.toy.springtoy.entities.Toy;
import com.toy.springtoy.service.ToyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToyController {

    @Autowired
    private ToyServiceImpl toyService;

    @GetMapping("/home")
    public String home(){
        return "this is home page from toy";
    }

    @PostMapping("/add-toy")
    public Toy addToy(@RequestBody Toy toy){
        this.toyService.addToy(toy);
        return toy;
    }

    @GetMapping("/toys")
    public List<Toy> allToy(){
        return this.toyService.getAllToy();
    }

    @GetMapping("/toy/{toyId}")
    public Toy getToy(@PathVariable("toyId") String toyId){
        return this.toyService.getToyByToyId(Integer.parseInt(toyId));
    }

    @DeleteMapping("/toy/{toyId}")
    public void removeToy(@PathVariable("toyId") String toyId){
        this.toyService.removeToy(Integer.parseInt(toyId));
    }

    @PutMapping("/toy/{toyId}")
    public Toy updateToy(@RequestBody Toy toyDetails ,@PathVariable("toyId") String toyId){
        Toy toy = this.toyService.getToyByToyId(Integer.parseInt(toyId));
        toy.setToyName(toyDetails.getToyName());
        toy.setToyPrice(toyDetails.getToyPrice());
        final Toy updatedToy = this.toyService.updateToy(toy);
        return toy;
    }
}
