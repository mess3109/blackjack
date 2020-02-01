package models;

public class BJPlayer extends Player {

  public BJPlayer(String name) {
    super(name);
  }

  public boolean playAgain(Card visibleCard) {
    if (this.getTotal() <= 11) {
      return true;
    } else if (this.getTotal() >= 18) {
      return false;
    } else if (visibleCard.getRank().getValue() > 5) {
      return true;
    } else {
      return false;
    }
  }

  @Override
  public String toString() {
    return "Player " + super.toString();
  }
}
