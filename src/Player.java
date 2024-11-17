
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Represents a player in the game with a name, a hand of cards, and a score.
 * Demonstrates encapsulation, aggregation, and maintainability.
 * 
 * This class is responsible for managing a player's cards and score.
 * 
 * @author rajpu
 */
public class Player {
    // Encapsulated fields
    private String name; // Stores the player's name.
    private ArrayList<Card> hand; // Aggregation: A player's hand contains multiple Card objects.
    private int score; // Stores the player's score.

    /**
     * Constructor to create a Player object with a specified name.
     * Initializes an empty hand and sets the score to 0.
     * 
     * @param name the name of the player.
     */
    public Player(String name) {
        this.name = name; // Name is initialized during object creation.
        this.hand = new ArrayList<>(); // Initializes an empty hand of cards.
        this.score = 0; // Initializes the player's score to 0.
    }

    /**
     * Gets the player's name.
     * 
     * @return the name of the player.
     */
    public String getName() {
        return name; // Provides controlled access to the player's name.
    }

    /**
     * Adds a card to the player's hand.
     * 
     * @param card the Card object to add to the hand.
     */
    public void addCard(Card card) {
        hand.add(card); // Adds a card to the player's hand.
    }

    /**
     * Plays the top card from the player's hand.
     * Removes and returns the first card in the hand.
     * 
     * @return the top Card object, or null if the hand is empty.
     */
    public Card playCard() {
        if (!hand.isEmpty()) { // Checks if the hand has cards.
            return hand.remove(0); // Removes and returns the top card.
        }
        return null; // Returns null if the hand is empty.
    }

    /**
     * Checks if the player has any cards left in their hand.
     * 
     * @return true if the player has cards; false otherwise.
     */
    public boolean hasCards() {
        return !hand.isEmpty(); // Returns true if the hand is not empty.
    }

    /**
     * Gets the number of cards in the player's hand.
     * 
     * @return the size of the hand.
     */
    public int getCardCount() {
        return hand.size(); // Returns the number of cards in the hand.
    }

    /**
     * Adds points to the player's score.
     * 
     * @param points the number of points to add.
     */
    public void addScore(int points) {
        this.score += points; // Increments the player's score.
    }

    /**
     * Gets the player's current score.
     * 
     * @return the player's score.
     */
    public int getScore() {
        return score; // Returns the current score of the player.
    }
}
