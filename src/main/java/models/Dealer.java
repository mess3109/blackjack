package models;

public class Dealer extends Player {

  public Dealer(String name) {
    super(name);
  }

  public boolean playAgain() {
    return this.getTotal() < 17;
  }
}
