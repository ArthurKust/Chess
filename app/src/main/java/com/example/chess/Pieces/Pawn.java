package com.example.chess.Pieces;

import com.example.chess.Extras.Coordinates;
import com.example.chess.Extras.Position;

import java.util.ArrayList;

public class Pawn extends Piece{

    public Pawn(boolean white) {
        super(white);
    }

    @Override
    public ArrayList<Coordinates> RightMoves(Coordinates coordinates , Position[][] board){

        ArrayList<Coordinates> rightMoves = new ArrayList<>();
        rightMoves.clear();
        Coordinates c;

        if(board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){

            if(coordinates.getY()-1>=0){
                if(board[coordinates.getX()][coordinates.getY()-1].getPiece()==null){
                    c=new Coordinates(coordinates.getX() , coordinates.getY() - 1);
                    rightMoves.add(c);

                    if((coordinates.getY() == 6) && (board[coordinates.getX()][coordinates.getY() - 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() - 2);
                        rightMoves.add(c);
                    }
                }
            }

            if(coordinates.getX()+1<8 && coordinates.getY()-1>=0) {
                if (board[coordinates.getX() + 1][coordinates.getY() - 1].getPiece() != null) {
                    if(board[coordinates.getX() + 1][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 1);
                        rightMoves.add(c);
                    }
                }

            }

            if( coordinates.getX()- 1>=0 && coordinates.getY()-1>=0) {
                if (board[coordinates.getX() - 1][coordinates.getY() - 1].getPiece() != null) {
                    if(board[coordinates.getX() - 1][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 1);
                        rightMoves.add(c);
                    }
                }
            }

        }else{

            if(coordinates.getY()+1<8) {
                if (board[coordinates.getX()][coordinates.getY() + 1].getPiece() == null) {
                    c = new Coordinates(coordinates.getX(), coordinates.getY() + 1);
                    rightMoves.add(c);

                    if(coordinates.getY() == 1 && (board[coordinates.getX()][coordinates.getY() + 2].getPiece() == null)){
                        c = new Coordinates(coordinates.getX(), coordinates.getY() + 2);
                        rightMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()+1)<8 && (coordinates.getY()+1)<8) {
                if (board[coordinates.getX() + 1][coordinates.getY() + 1].getPiece() != null) {
                    if(board[coordinates.getX() + 1][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 1);
                        rightMoves.add(c);
                    }
                }
            }

            if((coordinates.getX()-1)>=0 && (coordinates.getY()+1)<8) {
                if (board[coordinates.getX() - 1][coordinates.getY() + 1].getPiece() != null) {
                    if(board[coordinates.getX() - 1][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                        c = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 1);
                        rightMoves.add(c);
                    }
                }
            }

        }
        return rightMoves;
    }
}