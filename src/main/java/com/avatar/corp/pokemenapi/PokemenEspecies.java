package com.avatar.corp.pokemenapi;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.net.URL;
import java.util.List;
@JsonIgnoreProperties
public class PokemenEspecies {
    private int count;
    private URL next;
    private URL previous;
    private List<Result> results;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public URL getNext() {
        return next;
    }

    public void setNext(URL next) {
        this.next = next;
    }

    public URL getPrevious() {
        return previous;
    }

    public void setPrevious(URL previous) {
        this.previous = previous;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public static class Result implements Serializable {
        private static final long serialVersionUID = 1L;
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
