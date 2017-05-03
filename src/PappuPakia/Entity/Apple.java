package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class Apple extends entity {
    public Apple(int xCord, int yCord) {
        super(xCord, yCord, 32, 32);
    }

    @Override
    public Image getImages() {
        return resources.apple;
    }
}
