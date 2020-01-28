import models.Game;
import models.Player;

public class BlackJack {

  public static void main(String[] args) {

    Player player = new Player();
    Player dealer = new Player();

    Game game = new Game(player, dealer);

  }
}
