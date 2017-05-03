package PappuPakia;

import javax.swing.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class Game {

    public static void main(String[] args) {
        JFrame J=new JFrame();
        GamePanel G=new GamePanel();
        J.setResizable(false);

        J.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        J.add(G);
        J.pack();
        J.setVisible(true);


    }


}
