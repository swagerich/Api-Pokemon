package com.avatar.corp.pokemenapi;



import java.util.List;

 public class ResponseApi {
    List<Pokemen> results;


    public ResponseApi(List<Pokemen> results) {
        this.results = results;
    }

    public ResponseApi() {
    }

    public List<Pokemen> getResult() {
        return results;
    }

    public void setResult(List<Pokemen> results) {
        this.results = results;
    }
}
