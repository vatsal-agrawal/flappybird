package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class log extends entity {
    public log(int xCord, int yCord) {
        super(xCord, yCord,69,112);
    }

    @Override
    public Image getImages() {

        return resources.log;
    }
}
