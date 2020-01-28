package models;

import java.util.ArrayList;
import java.util.List;

public class Deck {

  List<Card> cards;

  public Deck() {
    this.cards = new ArrayList<Card>();

    for (Suit suit: Suit.getAll()) {
      for (Rank rank: Rank.getAll()) {
        this.cards.add(new Card(suit, rank));
      }
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
