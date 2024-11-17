
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * This is an abstract class representing a generic game. It serves as a blueprint
 * for specific game implementations, where the rules of playing and declaring a winner 
 * will be defined in subclasses. The class manages the name of the game and the players 
 * involved in the game.
 * 
 * @author rajpu
 */

// The Game class is abstract, so it cannot be instantiated directly, only through subclassing.
public abstract class Game {
    private final String name; 
    
    // Aggregation: The players are part of the game, but they can exist independently.
    private ArrayList<Player> players; // List of players involved in the game.

    /**
     * Constructor to initialize a game with its name and an empty list of players.
     * 
     * @param name The name of the game.
     */
    public Game(String name) {
        this.name = name;
        players = new ArrayList<>(); // Initialize the list of players as an empty ArrayList.
    }

    /**
     * Getter for the name of the game.
     * 
     * @return The name of the game.
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the list of players in the game.
     * 
     * @return The list of players in the game.
     */
    public ArrayList<Player> getPlayers() {
        return players;
    }

    /**
     * Setter for the list of players in the game.
     * 
     * @param players The list of players to set for the game.
     */
    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    /**
     * Abstract method that must be implemented in subclasses to define how the game is played.
     * This will contain the logic for the specific game rules (e.g., turn-taking, card drawing).
     */
    public abstract void play(); // Method to start and play the game.

    /**
     * Abstract method that must be implemented in subclasses to declare the winner of the game.
     * This will define the criteria for winning (e.g., highest score, best hand, etc.).
     */
    public abstract void declareWinner(); // Method to declare the winner of the game.
}
