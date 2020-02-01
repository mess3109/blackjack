package models;

public class Game {

  private Deck deck;
  private BJPlayer player;
  private BJPlayer dealer;
  private boolean gameOver;

  public Game(BJPlayer player, BJPlayer dealer) {
    this.deck = new Deck();
    this.player = player;
    this.dealer = dealer;
    dealRound();
  }

  public void dealRound() {
    player.addCard(deck);
    dealer.addCard(deck);
    player.addCard(deck);
    dealer.addCard(deck);
  }

  public Deck getDeck() {
    return this.deck;
  }

  public BJPlayer checkWinner() {
    if (player.checkHandOver()) {
      return this.dealer;
    } else if (dealer.checkHandOver()) {
      return this.player;
    } else if (dealer.getHandSum() > player.getHandSum()) {
      return this.dealer;
    } else {
      return this.player;
    }
  }
}
