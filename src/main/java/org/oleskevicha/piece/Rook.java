package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Rook extends Piece{
    protected Rook(Color color, Coordinates coordinates) {
        super(color, Type.ROOK, coordinates);
    }
}
