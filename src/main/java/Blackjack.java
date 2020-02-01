import models.BPlayer;
import models.Dealer;
import models.Game;

public class Blackjack {

  public static void main(String[] args) {

    BPlayer player = new BPlayer("M");
    Dealer dealer = new Dealer("D");

    Game game = new Game(player, dealer);

    while (player.playAgain(game.getVisibleDealerCard()) && !game.isOver()) {
      game.hit(player);
    }

    if (game.isOver()) {
      System.out.println("Player loses");
    }

    while (dealer.playAgain() && !game.isOver()) {
      game.hit(dealer);
    }

    game.printWinner();
  }
}
