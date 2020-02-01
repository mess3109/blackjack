import models.Deck;
import models.Game;

public class BlackJack {

  public static void main(String[] args) {

    BJPlayer player = new BJPlayer("BJPlayer");
    BJPlayer dealer = new BJPlayer("Dealer");

    Game game = new Game(player, dealer);
    Deck deck = game.getDeck();

    player.playRound(deck);
    if (!player.checkHandOver()) {
      dealer.playRound(deck);
    }

    BJPlayer winner = game.checkWinner();



    System.out.println(winner.getName());
  }
}
