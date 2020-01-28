package models;

public class Card {

  private Suit suit;
  private Integer val;

  public Card(Suit suit, Integer val) {
    this.suit = suit;
    this.val = val;
  }

  public Suit getSuit() {
    return suit;
  }

  public Integer getVal() {
    return val;
  }
}
