package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Bishop extends Piece{
    protected Bishop(Color color, Coordinates coordinates) {
        super(color, Type.BISHOP, coordinates);
    }
}
