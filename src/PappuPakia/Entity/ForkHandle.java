package PappuPakia.Entity;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class ForkHandle extends entity {

    public ForkHandle(int xCord, int yCord) {
        super(xCord, yCord,22,312);
        this.xVel = -5;
        this.yCord= 0;
    }

    @Override
    public Image getImages() {
        return null;
    }
}
