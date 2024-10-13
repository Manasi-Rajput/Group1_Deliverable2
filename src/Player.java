
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajpu
 */
public class Player {
    

    private String name;
    private ArrayList<Card> hand;

    public Player(String name) {
        this.name = name;
        hand = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public Card playCard() {
        if (!hand.isEmpty()) {
            return hand.remove(0); // Play the top card
        }
        return null; // No cards left to play
    }

    public boolean hasCards() {
        return !hand.isEmpty();
    }

    public int getCardCount() {
        return hand.size();
    }
}
