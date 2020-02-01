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
    player.printHand();
    System.out.println(this.dealer + " is showing card: " + visibleDealerCard);
  }

  private void dealRound() {
    this.player.addCard(deck.getNextCard());
    this.dealer.addCard(deck.getNextCard());
    this.player.addCard(deck.getNextCard());
    this.visibleDealerCard = deck.getNextCard();
    this.dealer.addCard(this.visibleDealerCard);
  }

  public void hit(Player player) {
    Card card = deck.getNextCard();
    player.addCard(card);
    System.out.println("Player " + player + " hits and is dealt " + card.toString());
    player.printHand();
  }

  public Card getVisibleDealerCard() {
    return this.visibleDealerCard;
  }

  public boolean isOver() {
    return this.player.getTotal() >= 21 || this.dealer.getTotal() >= 21;
  }

  public void printWinner() {
    if (player.isOver()) {
      System.out.println(dealer + " wins with total " + dealer.getTotal());
    } else if (dealer.isOver()) {
      System.out.println(player + " wins with total " + player.getTotal());
    } else if (dealer.getTotal() == player.getTotal()) {
      System.out.println("Push");
    } else if (dealer.getTotal() > player.getTotal()) {
      System.out.println(dealer + " wins with total " + dealer.getTotal());
    } else {
      System.out.println(player + " wins with total " + player.getTotal());
    }
  }
}
