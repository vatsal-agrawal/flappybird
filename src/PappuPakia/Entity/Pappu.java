package PappuPakia.Entity;

import PappuPakia.RandomFunction;
import PappuPakia.resources;
import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class Pappu extends entity {
    int count = 0;

    public Pappu(int xCord, int yCord) {
        super(xCord, yCord, 59, 59);
    }

    public void update() {

        super.update();
        count++;
        count %= 7;
    }

    public void pappuVis(int xCord, int yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
        this.xVel = RandomFunction.getInt( 5, 10);
        this.yVel = RandomFunction.getInt(-3, 3);
        this.xAcc = 0;
        this.yAcc = 0;
    }

    @Override
    public Image getImages() {
        return resources.pappu[count];
    }
}
