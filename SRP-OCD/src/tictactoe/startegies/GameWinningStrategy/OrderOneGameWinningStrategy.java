package tictactoe.startegies.GameWinningStrategy;

import tictactoe.models.Board;
import tictactoe.models.Cell;
import tictactoe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneGameWinningStrategy implements GameWinningStrategy{
    private int dimension;
    List<HashMap<Character,Integer>> rowsMap;
    List<HashMap<Character,Integer>> colsMap;
    List<HashMap<Character,Integer>> diagonalMap;

    public OrderOneGameWinningStrategy(int dimension){
        this.dimension = dimension;
        rowsMap = new ArrayList<>();
        colsMap = new ArrayList<>();
        for(int idx = 0;idx<dimension;idx++){
            rowsMap.add(new HashMap<>());
            colsMap.add(new HashMap<>());
        }
        diagonalMap = new ArrayList<>();
        for(int idx = 0;idx<2;idx++){
            diagonalMap.add(new HashMap<>());
        }
    }

    private boolean incrementHashMapValue(HashMap<Character,Integer> hashMap, char key){
        if(!hashMap.containsKey(key))
            hashMap.put(key,1);
        else
            hashMap.put(key,hashMap.get(key)+1);
        return hashMap.get(key) == dimension;
    }

    public boolean checkWinner(Board board, Player lastPlayedPlayer, Cell lastPlayedMoveCell){
        if(incrementHashMapValue(rowsMap.get(lastPlayedMoveCell.getRow()),lastPlayedPlayer.getSymbol()))
            return true;
        if(incrementHashMapValue(colsMap.get(lastPlayedMoveCell.getRow()),lastPlayedPlayer.getSymbol()))
            return true;
        if(lastPlayedMoveCell.getRow() == lastPlayedMoveCell.getCol()) {
            if(incrementHashMapValue(diagonalMap.get(0), lastPlayedPlayer.getSymbol()))
                return true;
        }
        if(lastPlayedMoveCell.getRow()+lastPlayedMoveCell.getCol() == dimension-1){
            if(incrementHashMapValue(diagonalMap.get(1), lastPlayedPlayer.getSymbol()))
                return true;
        }
        return false;
    }
}
