/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The Card class represents a single playing card, with a suit and rank.
 * It provides methods to retrieve the suit and rank of the card, 
 * as well as a method to compare the card's value.
 * 
 * @author rajpu
 */
public class Card {
    // Encapsulated fields: The suit and rank of the card.
    private final String suit; // Stores the suit of the card (e.g., Hearts, Diamonds).
    private final String rank; // Stores the rank of the card (e.g., 2, 3, K, A).

    /**
     * Constructor to initialize a card with a suit and rank.
     *
     * @param suit  The suit of the card.
     * @param rank  The rank of the card.
     */
    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Getter for the suit of the card.
     *
     * @return The suit of the card.
     */
    public String getSuit() {
        return suit;
    }

    /**
     * Getter for the rank of the card.
     *
     * @return The rank of the card.
     */
    public String getRank() {
        return rank;
    }

    /**
     * Overrides the toString method to provide a string representation of the card.
     *
     * @return A string like "2 of Hearts" for example.
     */
    @Override
    public String toString() {
        return rank + " of " + suit; // Returns a formatted string.
    }

    /**
     * Method to get the value of the card for comparison.
     * The values are assigned based on traditional card values:
     * 2-10 have their face values, J=11, Q=12, K=13, A=14.
     *
     * @return The integer value of the card.
     */
    public int value() {
        switch (rank) {
            case "2" -> {
                return 2; // Case for rank 2
            }
            case "3" -> {
                return 3; // Case for rank 3
            }
            case "4" -> {
                return 4; // Case for rank 4
            }
            case "5" -> {
                return 5; // Case for rank 5
            }
            case "6" -> {
                return 6; // Case for rank 6
            }
            case "7" -> {
                return 7; // Case for rank 7
            }
            case "8" -> {
                return 8; // Case for rank 8
            }
            case "9" -> {
                return 9; // Case for rank 9
            }
            case "10" -> {
                return 10; // Case for rank 10
            }
            case "J" -> {
                return 11; // Jack is worth 11
            }
            case "Q" -> {
                return 12; // Queen is worth 12
            }
            case "K" -> {
                return 13; // King is worth 13
            }
            case "A" -> {
                return 14; // Ace is worth 14
            }
            default -> throw new IllegalArgumentException("Invalid rank: " + rank); // Handles invalid rank.
        }
    }
}
