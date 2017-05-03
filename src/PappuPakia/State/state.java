package PappuPakia.State;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public abstract class state {

    abstract public void update();
    abstract public void render(Graphics G);
    abstract public void onKeyPressed(int getkeyCode);




}
