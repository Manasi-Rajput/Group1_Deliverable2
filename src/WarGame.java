/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rajpu
 */

public class WarGame extends Game {
    private GroupOfCards deck;
    private Player player1;
    private Player player2;

    public WarGame(String name, Player player1, Player player2) {
        super(name);
        this.player1 = player1;
        this.player2 = player2;
        this.deck = new GroupOfCards(52); // Standard deck size
        initializeDeck();
    }

    private void initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String rank : ranks) {
                deck.addCard(new Card(suit, rank));
            }
        }
        deck.shuffle();
        dealCards();
    }

    private void dealCards() {
        while (!deck.getCards().isEmpty()) {
            player1.addCard(deck.dealCard());
            player2.addCard(deck.dealCard());
        }
    }

    public void play() {
        while (player1.hasCards() && player2.hasCards()) {
            playRound();
        }
        declareWinner();
    }

    private void playRound() {
        Card card1 = player1.playCard();
        Card card2 = player2.playCard();

        System.out.println(player1.getName() + " plays: " + card1);
        System.out.println(player2.getName() + " plays: " + card2);

        if (card1.value() > card2.value()) {
            System.out.println(player1.getName() + " wins the round!");
            player1.addCard(card1);
            player1.addCard(card2);
        } else if (card1.value() < card2.value()) {
            System.out.println(player2.getName() + " wins the round!");
            player2.addCard(card1);
            player2.addCard(card2);
        } else {
            System.out.println("It's a tie!");
            // You could add tie handling logic here if desired
        }
    }

    public void declareWinner() {
        if (player1.getCardCount() > player2.getCardCount()) {
            System.out.println(player1.getName() + " wins the game!");
        } else if (player1.getCardCount() < player2.getCardCount()) {
            System.out.println(player2.getName() + " wins the game!");
        } else {
            System.out.println("The game is a tie!");
        }
    }
}
