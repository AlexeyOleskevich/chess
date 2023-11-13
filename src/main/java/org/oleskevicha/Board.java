package org.oleskevicha;

import org.oleskevicha.piece.Pawn;
import org.oleskevicha.piece.Piece;

import java.util.HashMap;

public class Board {
    HashMap<Coordinates, Piece> board;

    public Board() {
        board = new HashMap<>();
    }

    public void setPiece(Coordinates coordinates, Piece piece) {
        piece.setCoordinates(coordinates);
        board.put(coordinates, piece);
    }

    public void setupDefaultPiecesPosition() {
        for (File file : File.values()) {
            setPiece(new Coordinates(file, 7), new Pawn(Color.BLACK, new Coordinates(file, 7)));
            setPiece(new Coordinates(file, 2), new Pawn(Color.WHITE, new Coordinates(file, 2)));
        }
    }

    public static boolean isSquareDark(Coordinates coordinates) {
        return ((coordinates.file.ordinal() + 1) + coordinates.rank) % 2 == 0;
    }
}
