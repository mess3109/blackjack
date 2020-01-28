package models;

public enum Suit {

  SPADE, HEART, CLUB, DIAMOND;

  public static Suit[] getAll() {
    return new Suit[]{SPADE, HEART, CLUB, DIAMOND};
  }
}
