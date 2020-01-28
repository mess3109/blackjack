package models;

public class Game {

  private Deck deck;
  private Player player;
  private Player dealer;

  public Game() {
    this.deck = new Deck();
  }
}
