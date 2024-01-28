package tictactoe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<List<Cell>> board;

    public Board(int dimension){
        for(int row = 0;row<dimension;row++){
            this.board.add(new ArrayList<>());
            for(int col = 0;col<dimension;col++){
                this.board.get(row).add(new Cell(row,col));
            }
        }
    }

    public void display(){
        for(int row = 0;row<board.size();row++){
            for(int col = 0;col < board.size(); col++){
                if(board.get(row).get(col).getCellState().equals(CellState.EMPTY))
                    System.out.println("|  |");
                else if(board.get(row).get(col).getCellState().equals(CellState.FILLED))
                    System.out.println("| " + board.get(row).get(col).getPlayer().getSymbol() + " |");
                else
                    System.out.println("| - |");
            }
            System.out.println("\n");
        }
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
