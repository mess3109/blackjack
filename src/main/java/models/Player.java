package models;

import java.util.ArrayList;
import java.util.List;

public class Player {

  List<Card> hand;
  String name;

  public Player(String name) {
    this.name = name;
    refreshHand();
  }

  public void hit(Deck deck) {
    this.hand.add(deck.getNextCard());
  }

  public void stand() {

  }

  public String getName() {
    return this.name;
  }

  private void refreshHand() {
    this.hand = new ArrayList<Card>();
  }

  public boolean checkHandOver() {
    int sum = getHandSum();
    return sum > 21;
  }

  public int getHandSum() {
    int sum = 0;
    for (Card card : hand) {
      sum += Math.min(card.getValue(), 10);
    }
    return sum;
  }

  public void playRound(Deck deck) {
    if (getHandSum() <= 12) {
      hit(deck);
    } else {
      stand();
    }
  }
}
