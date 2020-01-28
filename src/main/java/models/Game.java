package models;

public class Game {

  private Deck deck;
  private Player player;
  private Player dealer;

  public Game(Player player, Player dealer) {
    this.deck = new Deck();
    this.player = player;
    this.dealer = dealer;
    dealRound();
  }

  public void dealRound() {
    player.hit(deck);
    dealer.hit(deck);
    player.hit(deck);
    dealer.hit(deck);
  }
}
