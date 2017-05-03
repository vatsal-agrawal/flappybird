package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public class TreeBack extends Motion {

    public TreeBack(int xCord, int yCord) {
        super(xCord, yCord);
        this.xVel = -2;
    }

    @Override
    public Image getImages() {
        return resources.treeb;
    }
}

//    public void {
//        x = xCord;
//        y = yCord;
//    }TreeBCord(int x,int y)
//}