package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 05-03-2017.
 */
public class Star extends entity {
    public Star(int xCord, int yCord) {
        super(xCord, yCord, 41,39);
        this.xVel = -5;
    }

    @Override
    public Image getImages() {
        return resources.star;
    }
}
