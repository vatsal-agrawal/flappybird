package PappuPakia.Entity;

import java.awt.*;

/**
 * Created by LENOVO on 26-02-2017.
 */
public abstract class Motion extends entity {
    public Motion(int xCord, int yCord) {
        super(xCord, yCord, 0,0);

    }

    @Override
    public Image getImages() {
        return null;
    }
}
