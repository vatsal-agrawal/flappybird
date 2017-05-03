package PappuPakia.State;

import PappuPakia.GamePanel;
import PappuPakia.resources;

import java.awt.*;
import java.awt.event.KeyEvent;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class MenuState extends state {
private int selectOption=0,count=0;
//private List<Pappu> pappuList;
//    private List<entity> e;
    @Override
    public void update() {
//e.u();
        count++;
        count %=7;
    }

    @Override
    public void render(Graphics G) {
        G.drawImage(resources.bg, 0, 0, null);
        G.drawImage(resources.stand, 800, 105, null);
        G.drawImage(resources.planktop, 700, 115, null);
        G.drawImage(resources.plankmid,700, 200, null);
        G.drawImage(resources.plankbot, 700, 300, null);
        G.drawImage(resources.log,150,320,null);
        G.drawImage(resources.pappu[2],145,280,null);
        G.drawImage(resources.ground,0,0,null);
    }

    @Override
    public void onKeyPressed(int getkeyCode) {
        if(getkeyCode == KeyEvent.VK_UP)
            selectOption =0;
        if(getkeyCode == KeyEvent.VK_DOWN)
            selectOption=1;

        if(selectOption==0&&getkeyCode == KeyEvent.VK_SPACE)
        GamePanel.currentState = new StageState();
//            System.out.println("wrong");

    }
}
