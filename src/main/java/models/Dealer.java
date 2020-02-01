package models;

public class Dealer extends Player {

  public Dealer(String name) {
    super(name);
  }

  public boolean playAgain() {
    return this.getTotal() < 17;
  }

  @Override
  public String toString() {
    return "Dealer " + super.toString();
  }
}
