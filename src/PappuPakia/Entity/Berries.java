package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class Berries extends entity {

    public Berries(int xCord, int yCord) {
        super(xCord, yCord, 31,49);
        xVel = -5;
    }

    @Override
    public Image getImages() {

        return resources.berries;

    }
}
