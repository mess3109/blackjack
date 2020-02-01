import models.BJPlayer;
import models.Dealer;
import models.Game;

public class BlackJack {

  public static void main(String[] args) {

    BJPlayer player = new BJPlayer("M");
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
