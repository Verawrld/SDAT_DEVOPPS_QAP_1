package com.example;

import java.util.ArrayList;
import java.util.List;

public class GameStore {
    private List<Game> gameCatalog = new ArrayList<>();
    private Cart cart = new Cart();

    public void loadGameCatalog() {
        gameCatalog.add(new Game("Elden Ring", "Souls-Like", 89.99));
        gameCatalog.add(new Game("Rainbow Six Seige", "Fps", 19.99));
        gameCatalog.add(new Game("Minecraft", "Adventure", 39.99));
    }

    public void browseGames() {
        System.out.println("Available games:");
        gameCatalog.forEach(System.out::println);
    }

    public void addGameToCart(String title) {
        for (Game game : gameCatalog) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                cart.addGame(game);
                return;
            }
        }
        System.out.println("Game not found.");
    }

    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Cannot checkout. The cart is empty.");
        } else {
            System.out.println("Purchase successful! Here are your purchased games:");
            cart.displayCart();
            cart.clear();
        }
    }

    public Cart getCart() {
        return cart;
    }
}
