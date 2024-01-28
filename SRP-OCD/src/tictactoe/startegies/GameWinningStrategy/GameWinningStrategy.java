package tictactoe.startegies.GameWinningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Player;

public interface GameWinningStrategy {
    boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell);
}