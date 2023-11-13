package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Queen extends Piece{
    protected Queen(Color color, Coordinates coordinates) {
        super(color, Type.QUEEN, coordinates);
    }
}
