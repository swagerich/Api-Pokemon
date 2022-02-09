package com.avatar.corp.pokemenapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Pokemen {
    private String name;

    public Pokemen(String name) {
        this.name = name;

    }
    public Pokemen() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}