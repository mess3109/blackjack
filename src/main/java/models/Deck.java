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

    this.shuffle();
  }

  public Card getNextCard() {
    return cards.remove(0);
  }

  private void shuffle() {
    for (int i = 0; i < cards.size(); i++) {
      int j = (int) Math.floor(Math.random() * (i + 1));
      Card temp = cards.get(i);
      cards.set(i, cards.get(j));
      cards.set(j, temp);
    }
  }
}
