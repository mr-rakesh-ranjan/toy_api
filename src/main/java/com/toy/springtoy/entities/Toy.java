package com.toy.springtoy.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int toyId;
    private String toyName;
    private int toyPrice;

    public Toy(int toyId, String toyName, int toyPrice) {
        this.toyId = toyId;
        this.toyName = toyName;
        this.toyPrice = toyPrice;
    }

    public Toy() {
        super();
    }

    public int getToyId() {
        return toyId;
    }

    public void setToyId(int toyId) {
        this.toyId = toyId;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getToyPrice() {
        return toyPrice;
    }

    public void setToyPrice(int toyPrice) {
        this.toyPrice = toyPrice;
    }

    @Override
    public String toString() {
        return "Toy [ toyId=" + toyId + "toyName=" + toyName + "toyPrice=" + toyPrice + "]";
    }
}
