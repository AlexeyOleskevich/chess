package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Knight extends Piece{
    protected Knight(Color color, Coordinates coordinates) {
        super(color, Type.KNIGHT, coordinates);
    }
}
