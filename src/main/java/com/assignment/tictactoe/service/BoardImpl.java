package com.assignment.tictactoe.service;

public class BoardImpl implements Board {

    Piece[][] pieces;

    BoardImpl(){

    }

    public void initializeBoard(){

    }

    public boolean isLegalMove(int row, int col){
        return false;
    }

    public void updateMove(int row, int col, Piece piece){

    }

    public Winner checkWinner(){
        return null;
    }

    public void printBoard(){

    }

    public BoardUi getBoardUi(){
        return null;
    }
}
