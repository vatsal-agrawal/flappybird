package PappuPakia;

import PappuPakia.State.MenuState;
import PappuPakia.State.state;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;


/**
 * Created by LENOVO on 25-02-2017.
 */
public class GamePanel extends JPanel implements Runnable, KeyListener {
    public static state currentState;
    public Thread t1;

    public GamePanel() {
        this.setPreferredSize(new Dimension(1000, 500));
        this.addKeyListener(this);
        this.setFocusable(true);
        this.requestFocus();
        GamePanel.currentState = new MenuState();

    }
    public void addNotify() {
        super.addNotify();
        resources.Res();
        t1 = new Thread(this);
        t1.setName("New Thread");
        t1.start();

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
GamePanel.currentState.onKeyPressed(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {
        Image img = new BufferedImage(1000, 550, BufferedImage.TYPE_INT_RGB);

        while (true) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }

            GamePanel.currentState.update();
            Graphics panelGraphics = this.getGraphics();
            Graphics imageGraphics = img.getGraphics();
            imageGraphics.clearRect(0, 0, 1000, 500);

            GamePanel.currentState.render(imageGraphics);
            imageGraphics.dispose();
            panelGraphics.drawImage(img, 0, 0, null);
            panelGraphics.dispose();
        }
    }
}
