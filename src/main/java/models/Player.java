package models;

import java.util.ArrayList;
import java.util.List;

public class Player {

  List<Card> hand;

  public Player() {
    refreshHand();
  }

  public void hit(Deck deck) {
    this.hand.add(deck.getNextCard());
  }

  public void stand() {

  }

  private void refreshHand() {
    this.hand = new ArrayList<Card>();
  }
}
