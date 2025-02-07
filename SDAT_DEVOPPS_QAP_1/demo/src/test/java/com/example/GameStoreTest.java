package com.example;

import com.example.GameStore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GameStoreTest {

    private GameStore store;

    @BeforeEach
    void setUp() {
        store = new GameStore();
        store.loadGameCatalog();
    }

    @Test
    void testAddGameToCart() {
        store.addGameToCart("Minecraft");
        assertFalse(store.getCart().isEmpty(), "Cart should not be empty after adding a game");
    }

    @Test
    void testCartTotalCalculation() {
        store.addGameToCart("Elden Ring");
        store.addGameToCart("Rainbow Six Seige");
        double expectedTotal = 89.99 + 19.99;
        assertEquals(expectedTotal, store.getCart().calculateTotal(), 0.01, "Cart total should match sum of game prices");
    }

    @Test
    void testCheckoutClearsCart() {
        store.addGameToCart("Rainbow Six Seige");
        store.checkout();
        assertTrue(store.getCart().isEmpty(), "Cart should be empty after checkout");
    }
}
