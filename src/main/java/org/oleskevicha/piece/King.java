package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class King extends Piece{
    protected King(Color color, Coordinates coordinates) {
        super(color, Type.KING, coordinates);
    }
}
