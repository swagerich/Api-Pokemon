package com.avatar.corp.pokemenapi;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
public class PokemonController {

    private RestTemplate restTemplate;

    public PokemonController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    /*private static String Endpoint="https://pokeapi.co/api/v2/pokemon/1";

    @GetMapping("/test")
    public Object getPokemon(){
      return  restTemplate.getForObject(Endpoint,Object.class);
       *//* return Arrays.asList(pokemon);*//*

    }*/


    @GetMapping("/names")
    public List<Pokemen> buscarNamePokemon() {
          HttpEntity<String> entity = getHttpEntity();
        ResponseEntity<ResponseApi> intercambio = restTemplate.exchange("https://pokeapi.co/api/v2/pokemon",
                                                  HttpMethod.GET, entity,ResponseApi.class);
        var pokemons = intercambio.getBody().getResult();
        return pokemons;
    }



    private HttpEntity<String> getHttpEntity() {
        HttpHeaders header = new HttpHeaders();
        header.set("ContentType","application/json");
        HttpEntity<String> entity = new HttpEntity(header);
        return entity;
    }






}
