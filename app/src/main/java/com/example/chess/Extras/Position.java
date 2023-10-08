package com.example.chess.Extras;

import com.example.chess.Pieces.Piece;

public class Position {
    private Piece piece;


    public Position(Piece piece ) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;

    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

}