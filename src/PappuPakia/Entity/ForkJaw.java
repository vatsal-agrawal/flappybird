package PappuPakia.Entity;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class ForkJaw extends entity {
    public ForkJaw(int xCord, int yCord) {
        super(xCord, yCord, 33,59);
        this.xVel =-5;
        this.yCord=312;
    }

    @Override
    public Image getImages() {
        return null;
    }
}
