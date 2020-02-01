package models;

public class Game {

  private Deck deck;
  private Player player;
  private Dealer dealer;
  private Card visibleDealerCard;

  public Game(Player player, Dealer dealer) {
    this.deck = new Deck();
    this.player = player;
    this.dealer = dealer;
    dealRound();
  }

  public void dealRound() {
    this.player.addCard(deck.getNextCard());
    this.dealer.addCard(deck.getNextCard());
    this.player.addCard(deck.getNextCard());
    this.visibleDealerCard = deck.getNextCard();
    this.dealer.addCard(this.visibleDealerCard);
  }

  public void hit(Player player) {
    player.addCard(deck.getNextCard());
  }

  public Deck getDeck() {
    return this.deck;
  }

  public Card getVisibleDealerCard() {
    return this.visibleDealerCard;
  }

  public boolean isOver() {
    return this.player.getTotal() >= 21 || this.dealer.getTotal() >= 21;
  }

  public void printWinner() {
    if (player.isOver()) {
      System.out.println("Dealer " + dealer + " wins with total " + dealer.getTotal());
    } else if (dealer.isOver()) {
      System.out.println("Player " + player + " wins with total " + player.getTotal());
    } else if (dealer.getTotal() == player.getTotal()) {
      System.out.println("Push");
    } else if (dealer.getTotal() > player.getTotal()) {
      System.out.println("Dealer " + dealer + " wins with total " + dealer.getTotal());
    } else {
      System.out.println("Player " + player + " wins with total " + player.getTotal());
    }
  }
}
