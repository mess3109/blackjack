package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

  private String name;
  private List<Card> hand = new ArrayList<Card>();

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public boolean isOver() {
    return getTotal() > 21;
  }

  public int getTotal() {
    int minTotal = 0;
    int maxTotal = 0;
    for (Card card : hand) {
      int points = card.getRank().getValue();
      minTotal += points;
      maxTotal += (card.getRank() == Rank.ACE) ? 11 : points;
    }
    return (maxTotal > 21) ? minTotal : maxTotal;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  public String toString() {
    return name;
  }
}
