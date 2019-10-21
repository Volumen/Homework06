package com.example.demo.Model;

public class Movie {

    private String name;
    private int year;
    private String producer;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", producer='" + producer + '\'' +
                '}';
    }

    public Movie() {
    }

    public Movie(String name, int year, String producer) {
        this.name = name;
        this.year = year;
        this.producer = producer;
    }
}
