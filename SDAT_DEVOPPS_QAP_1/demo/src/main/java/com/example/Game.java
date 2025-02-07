package com.example;

public class Game {
    private String title;
    private String genre;
    private double price;

    public Game(String title, String genre, double price) {
        this.title = title;
        this.genre = genre;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return title + " (" + genre + ") - $" + price;
    }
}
