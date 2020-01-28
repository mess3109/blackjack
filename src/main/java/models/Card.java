package models;

public class Card {

  private Suit suit;
  private Integer value;

  public Card(Suit suit, Integer value) {
    this.suit = suit;
    this.value = value;
  }

  public Suit getSuit() {
    return suit;
  }

  public Integer getValue() {
    return value;
  }
}
