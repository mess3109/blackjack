package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();

    for (int i = 1; i <= 13; i++) {
      cards.add(new Card(Suit.CLUB, i));
      cards.add(new Card(Suit.SPADE, i));
      cards.add(new Card(Suit.DIAMOND, i));
      cards.add(new Card(Suit.HEART, i));
    }
  }

  private void shuffle() {

  }
}
