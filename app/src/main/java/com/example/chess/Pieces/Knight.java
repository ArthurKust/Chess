package com.example.chess.Pieces;

import com.example.chess.Extras.Coordinates;
import com.example.chess.Extras.Position;

import java.util.ArrayList;

public class Knight extends Piece {
    public Knight(boolean white) {
        super(white);
    }

    @Override
    public ArrayList<Coordinates> RightMoves(Coordinates coordinates, Position[][] board) {

        ArrayList<Coordinates> rightMoves = new ArrayList<>();
        rightMoves.clear();
        Coordinates coor;

        //1
        if (coordinates.getX()+1 < 8 && coordinates.getY() + 2 < 8) {
            if (board[coordinates.getX() + 1][coordinates.getY() + 2].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 2);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() + 1][coordinates.getY() + 2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() + 1, coordinates.getY() + 2);
                    rightMoves.add(coor);
                }
            }
        }

        //2
        if (coordinates.getX()+2 < 8 && coordinates.getY() + 1 < 8) {
            if (board[coordinates.getX() + 2][coordinates.getY() + 1].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() + 2, coordinates.getY() + 1);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() + 2][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() + 2, coordinates.getY() + 1);
                    rightMoves.add(coor);
                }
            }
        }

        //3
        if (coordinates.getX()+2 < 8 && coordinates.getY() - 1 >=0) {
            if (board[coordinates.getX() + 2][coordinates.getY() - 1].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() + 2, coordinates.getY() - 1);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() + 2][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() + 2, coordinates.getY() - 1);
                    rightMoves.add(coor);
                }
            }
        }

        //4
        if (coordinates.getX()+1 < 8 && coordinates.getY() - 2 >=0) {
            if (board[coordinates.getX() + 1][coordinates.getY() - 2].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 2);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() + 1][coordinates.getY() - 2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() + 1, coordinates.getY() - 2);
                    rightMoves.add(coor);
                }
            }
        }

        //5
        if (coordinates.getX()-1 >=0 && coordinates.getY() - 2 >=0) {
            if (board[coordinates.getX() - 1][coordinates.getY() - 2].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 2);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() - 1][coordinates.getY() - 2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() - 1, coordinates.getY() - 2);
                    rightMoves.add(coor);
                }
            }
        }

        //6
        if (coordinates.getX()-2 >=0 && coordinates.getY() - 1 >=0) {
            if (board[coordinates.getX() - 2][coordinates.getY() - 1].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() - 2, coordinates.getY() - 1);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() - 2][coordinates.getY() - 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() - 2, coordinates.getY() - 1);
                    rightMoves.add(coor);
                }
            }
        }

        //7
        if (coordinates.getX()-2 >=0 && coordinates.getY() + 1 < 8) {
            if (board[coordinates.getX() - 2][coordinates.getY() + 1].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() - 2, coordinates.getY() + 1);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() - 2][coordinates.getY() + 1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() - 2, coordinates.getY() + 1);
                    rightMoves.add(coor);
                }
            }
        }

        //8
        if (coordinates.getX()-1 >=0 && coordinates.getY() + 2 < 8) {
            if (board[coordinates.getX() - 1][coordinates.getY() + 2].getPiece() == null) {
                coor = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 2);
                rightMoves.add(coor);
            } else {
                if (board[coordinates.getX() - 1][coordinates.getY() + 2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()) {
                    coor = new Coordinates(coordinates.getX() - 1, coordinates.getY() + 2);
                    rightMoves.add(coor);
                }
            }
        }

        return rightMoves;
    }
}