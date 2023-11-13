package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Pawn extends Piece{
    public Pawn(Color color, Coordinates coordinates) {
        super(color, Type.PAWN, coordinates);
    }
}
