package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class Branch extends entity {


    public Branch(int xCord, int yCord) {
        super(xCord, yCord,31,500);

        this.xVel =-5;
    }

    @Override
    public Image getImages() {
        return resources.branch;
    }
}
