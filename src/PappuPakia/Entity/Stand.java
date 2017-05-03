package PappuPakia.Entity;

import PappuPakia.resources;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class Stand extends entity {
    public Stand(int xCord, int yCord) {
        super(xCord, yCord, 59,395);
    }

    @Override
    public Image getImages() {

        return resources.stand;
    }
}
