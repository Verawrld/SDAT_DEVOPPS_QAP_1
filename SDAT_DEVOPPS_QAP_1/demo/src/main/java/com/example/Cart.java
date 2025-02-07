package com.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Game> games = new ArrayList<>();

    public void addGame(Game game) {
        games.add(game);
        System.out.println(game.getTitle() + " added to the cart.");
    }

    public void removeGame(Game game) {
        if (games.remove(game)) {
            System.out.println(game.getTitle() + " removed from the cart.");
        } else {
            System.out.println(game.getTitle() + " was not found in the cart.");
        }
    }

    public double calculateTotal() {
        return games.stream().mapToDouble(Game::getPrice).sum();
    }

    public void clear() {
        games.clear();
    }

    public boolean isEmpty() {
        return games.isEmpty();
    }

    public void displayCart() {
        if (games.isEmpty()) {
            System.out.println("The cart is empty.");
        } else {
            System.out.println("Cart contents:");
            games.forEach(System.out::println);
            System.out.println("Total: $" + calculateTotal());
        }
    }
}
