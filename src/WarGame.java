/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * The WarGame class simulates a card game played between two players.
 * Extends the abstract Game class to implement gameplay logic.
 * Demonstrates inheritance, encapsulation, and aggregation.
 * 
 * @author rajpu
 */

public class WarGame extends Game {
    // Encapsulated fields
    private GroupOfCards deck; // Aggregation: A WarGame has a deck of cards.
    private Player player1; // Aggregation: Two players participate in the game.
    private Player player2;
    private int maxRounds; // Maximum number of rounds allowed in the game.
    private int roundsPlayed; // Tracks the number of rounds played.

    /**
     * Constructor to initialize the WarGame with players and a default deck.
     * 
     * @param name    The name of the game.
     * @param player1 The first player in the game.
     * @param player2 The second player in the game.
     */
    public WarGame(String name, Player player1, Player player2) {
        super(name); // Calls the parent Game class constructor.
        this.player1 = player1;
        this.player2 = player2;
        this.maxRounds = 4; // Sets a default maximum of 4 rounds.
        this.roundsPlayed = 0;
        this.deck = new GroupOfCards(52); // Creates a standard deck of 52 cards.
        initializeDeck(); // Initializes and shuffles the deck.
    }

    /**
     * Initializes the deck with 52 cards and shuffles them.
     * Uses a nested loop to generate all combinations of suits and ranks.
     */
    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.addCard(new Card(suit, rank)); // Adds a new Card object to the deck.
            }
        }
        deck.shuffle(); // Shuffles the deck to randomize the card order.
        dealCards(); // Distributes cards to both players.
    }

    /**
     * Deals cards alternately between the two players until the deck is empty.
     */
    private void dealCards() {
        while (!deck.getCards().isEmpty()) {
            player1.addCard(deck.dealCard());
            player2.addCard(deck.dealCard());
        }
    }

    /**
     * Plays the game for a maximum of 4 rounds or until a player runs out of cards.
     * Implements the abstract play() method from the Game class.
     */
    @Override
    public void play() {
        while (roundsPlayed < maxRounds && player1.hasCards() && player2.hasCards()) {
            playRound(); // Plays individual rounds.
        }
        declareWinner(); // Declares the winner after the game ends.
    }

    /**
     * Plays a single round of War, where both players play one card.
     * Determines the winner based on the card values.
     */
    private void playRound() {
        roundsPlayed++; // Increments the round counter.
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        // Outputs the cards played in the current round.
        System.out.println("Round " + roundsPlayed + ":");
        System.out.println(player1.getName() + " plays: " + card1);
        System.out.println(player2.getName() + " plays: " + card2);

        // Determines the winner of the round and updates the score.
        if (card1.value() > card2.value()) {
            System.out.println(player1.getName() + " wins the round!");
            player1.addScore(1);
        } else if (card1.value() < card2.value()) {
            System.out.println(player2.getName() + " wins the round!");
            player2.addScore(1);
        } else {
            System.out.println("It's a tie!");
        }
    }

    /**
     * Declares the winner at the end of the game based on scores.
     * Implements the abstract declareWinner() method from the Game class.
     */
    @Override
    public void declareWinner() {
        System.out.println("Game Over!");
        if (player1.getScore() > player2.getScore()) {
            System.out.println(player1.getName() + " wins the game with " + player1.getScore() + " points!");
        } else if (player1.getScore() < player2.getScore()) {
            System.out.println(player2.getName() + " wins the game with " + player2.getScore() + " points!");
        } else {
            System.out.println("The game is a tie with both players scoring " + player1.getScore() + " points!");
        }
    }
}
