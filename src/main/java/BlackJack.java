import models.Deck;
import models.Game;
import models.Player;

public class BlackJack {

  public static void main(String[] args) {

    Player player = new Player("Player");
    Player dealer = new Player("Dealer");

    Game game = new Game(player, dealer);
    Deck deck = game.getDeck();

    player.playRound(deck);
    if (!player.checkHandOver()) {
      dealer.playRound(deck);
    }

    Player winner = game.checkWinner();

    System.out.println(winner.getName());
  }
}
