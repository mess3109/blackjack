package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Player {

  private String name;
  private List<Card> hand = new ArrayList<Card>();

  public Player(String name) {
    this.name = name;
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
    return maxTotal > 21 ? minTotal : maxTotal;
  }

  public void addCard(Card card) {
    hand.add(card);
  }

  @Override
  public String toString() {
    return name;
  }

  public void printHand() {
    StringBuilder handSB = new StringBuilder();
    handSB.append(this);
    handSB.append(" has hand: ");

    for (Card card : this.hand) {
      handSB.append(card);
      handSB.append(", ");
    }

    System.out.append(handSB.toString());

    printTotal();
  }

  private void printTotal() {
    System.out.println(this + " has total " + this.getTotal());
  }
}
