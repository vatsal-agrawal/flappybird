package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class Trees extends Motion {
//public int  xCord=1000;

    public Trees(int xCord, int yCord) {
        super(xCord, yCord);
        this.xVel = -6;

    }



    @Override
    public Image getImages() {
return resources.treeF;
    }
}
