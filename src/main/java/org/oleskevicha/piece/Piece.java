package org.oleskevicha.piece;

import org.oleskevicha.Color;
import org.oleskevicha.Coordinates;
import org.oleskevicha.Type;

public class Piece {
    private final Color color;
    protected final Type type;
    private Coordinates coordinates;

    protected Piece(Color color, Type type, Coordinates coordinates) {
        this.color = color;
        this.coordinates = coordinates;
        this.type = type;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }
}
