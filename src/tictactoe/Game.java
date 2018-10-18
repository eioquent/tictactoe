/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Christopher's Laptop
 */
public class Game {
    public String[][] gameBoard;
    public String currentPlayer;
    public String player1;
    public String player2;
    
    public void createBoard(){
        gameBoard = new String[3][3];
        player1 = "X";
        player2 = "O";
        currentPlayer = player1;
    }
    
    public String currentPlayer(){
        return currentPlayer;
    }
    
    public void changePlayer(){
        if(currentPlayer.equals(player1)){
            currentPlayer = player2;
        }
        else{
            currentPlayer = player1;
        }
    }
    
    public void makeMove(int x, int y){
        if(currentPlayer.equals(player1)){
            gameBoard[x][y] = "X";
        }
        else{
            gameBoard[x][y] = "O";
        }
    }
    
    public boolean spaceInUse(int x, int y){
        if(gameBoard[x][y] == null){
            return false;
        }
        else{
            return true;
        }
    }
}
