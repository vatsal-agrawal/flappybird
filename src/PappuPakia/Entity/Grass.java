package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class Grass extends Motion{
    public Grass(int xCord, int yCord) {
        super(xCord, yCord);
        this.xVel= -5;
    }

    @Override
    public Image getImages() {
        return resources.ground;
    }
}
