package com.example;

public class Main {
    public static void main(String[] args) {
        GameStore store = new GameStore();
        store.loadGameCatalog();
        store.browseGames();

        store.addGameToCart("The Last Hero");
        store.addGameToCart("Speed Racer");
        store.getCart().displayCart();

        store.checkout();
    }
}
