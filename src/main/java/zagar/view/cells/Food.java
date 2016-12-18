package main.java.zagar.view.cells;

import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.awt.geom.Point2D;

/**
 * Created by xakep666 on 18.12.16.
 */
public final class Food extends Cell {
    public Food(@NotNull Point2D coordinate, @NotNull Color color, float size) {
        super(coordinate, color, size);
    }
}
