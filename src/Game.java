
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajpu
 */

public abstract class Game {
    private final String name; // the title of the game
    private ArrayList<Player> players; // the players of the game

    public Game(String name) {
        this.name = name;
        players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public abstract void play(); // Play the game

    public abstract void declareWinner(); // Declare the winner
}
