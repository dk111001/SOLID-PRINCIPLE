package tictactoe.startegies.botPlayingStrategy;

import tictactoe.models.Move;
import tictactoe.models.Player;

public interface BotPlayingStrategy {
    Move decideMove(Player player);
}
