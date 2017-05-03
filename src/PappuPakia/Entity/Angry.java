package PappuPakia.Entity;

import PappuPakia.RandomFunction;
import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 27-02-2017.
 */
public class Angry extends entity {
    public Angry(int xCord, int yCord) {
        super(xCord, yCord,52,51);

        this.yVel = -10;

        this.xAcc = -1;
    }

    public void angryJump(){
        this.yVel = -RandomFunction.getInt(9,19);

        this.xAcc = -RandomFunction.getInt(0,3);
    }
    public void angryInvisible() {
        this.xCord = RandomFunction.getInt(200,1000);
        this.yCord = 500;
        this.xVel = -RandomFunction.getInt(4,7);
        this.yVel = 0;
        this.yAcc = 0;
        this.xAcc = 0;

    }

    @Override
    public Image getImages() {
        return resources.angryPakia;
    }
}
