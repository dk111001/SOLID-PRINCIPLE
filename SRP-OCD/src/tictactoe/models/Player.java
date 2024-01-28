package tictactoe.models;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private char symbol;

    private PlayerType playerType;

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move decideMove(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please tell row number");
        int row = sc.nextInt();
        System.out.println("Please tell column number");
        int col = sc.nextInt();
        return new Move(this,new Cell(row,col));
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
