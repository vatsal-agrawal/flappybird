package PappuPakia.Entity;

import PappuPakia.RandomFunction;
import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 27-02-2017.
 */
public class Happy extends entity {
    public Happy(int xCord, int yCord) {
        super(xCord, yCord,52,51);

        this.xVel = -5;

    }

    public void happyJump(){
        this.yVel = -RandomFunction.getInt(9,12);

        this.xAcc = -1;
    }
    public void happyInvisible() {
        this.xCord = RandomFunction.getInt(700,900);
        this.yCord = 500;
        this.xVel = -5;
        this.yVel = 0;
        this.yAcc = 0;
        this.xAcc = 0;

    }



    @Override
    public Image getImages() {
        return resources.happyPakia;
    }
}
