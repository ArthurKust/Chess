package com.example.chess.Pieces;

import com.example.chess.Extras.Coordinates;
import com.example.chess.Extras.Position;

import java.util.ArrayList;

public class Piece {

    private boolean white;

    Piece(boolean white) {
        this.white = white;
    }

    public ArrayList<Coordinates> RightMoves(Coordinates coordinates , Position[][] board){
        ArrayList<Coordinates> rightMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                rightMoves.add(c);
            }
        }
        return rightMoves;
    }

    public boolean isWhite() {
        return white;
    }
}
