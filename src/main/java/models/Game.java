package models;

public class Game {

  private Deck deck;
  private Player player;
  private Dealer dealer;

  public Game(Player player, Dealer dealer) {
    this.deck = new Deck();
    this.player = player;
    this.dealer = dealer;
    dealRound();
  }

  public void dealRound() {
    this.player.addCard(deck.getNextCard());
    this.dealer.addCard(deck.getNextCard());
    this.player.addCard(deck.getNextCard());
    this.dealer.addCard(deck.getNextCard());
  }

  public Deck getDeck() {
    return this.deck;
  }

  public boolean isGameOver() {
    return this.player.getTotal() >= 21 || this.dealer.getTotal() >= 21;
  }
}
