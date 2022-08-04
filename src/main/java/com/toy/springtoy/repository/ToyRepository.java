package com.toy.springtoy.repository;

import com.toy.springtoy.entities.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ToyRepository extends JpaRepository<Toy, Integer> {

    @Query("select t from Toy t")
    public List<Toy> getAllToy();

    @Query("select t from Toy t where t.toyId = :e")
    public Toy getToyByToyId(@Param("e") int toyId );
}
