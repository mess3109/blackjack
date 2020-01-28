package models;

public class Game {

  private Deck deck;
  private Player player;
  private Player dealer;
  private boolean gameOver;

  public Game(Player player, Player dealer) {
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

  public Player checkWinner() {
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
