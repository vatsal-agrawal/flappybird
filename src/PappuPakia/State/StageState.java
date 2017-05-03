package PappuPakia.State;

import PappuPakia.Entity.*;
import PappuPakia.GamePanel;
import PappuPakia.RandomFunction;
import PappuPakia.resources;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class StageState extends state {

   private int count;
    private List<Branch> branches;
    private Pappu pappu, pappu2, pappu3, pappu4,pappuStar;
    private Berries berries;
    private Star stars;
    private List<entity> e;
    private List<Motion> motions;
    private List<Trees> trees;
    private List<Grass> grasses;
    private List<TreeBack> treeBacks;
    private List<Sky> skies;
    private List<Angry> angry;
    private List<Happy> happy;
    public static int treeB, treeF, grass, cloud, x, branchX, branchY, pappuX = 0, pappuY = 0;

    public StageState() {
        super();
        resources.defaultAudio.loop();
        branches = new ArrayList<>();
        e = new ArrayList<>();
        trees = new ArrayList<>();
        treeBacks = new ArrayList<>();
        grasses = new ArrayList<>();
        skies = new ArrayList<>();
        motions = new ArrayList<>();
        happy = new ArrayList<>();
        angry = new ArrayList<>();
        trees.add(new Trees(0, 0));
        trees.add(new Trees(1000, 0));
        grasses.add(new Grass(0, 0));
        grasses.add(new Grass(1000, 0));
        skies.add(new Sky(0, -100));
        skies.add(new Sky(1000, -100));
        treeBacks.add(new TreeBack(0, 0));
        treeBacks.add(new TreeBack(1000, 0));
        branches.add(new Branch(1500, -200));
        branches.add(new Branch(1200, -300));
        happy.add(new Happy(800, 500));
        angry.add(new Angry(400, 500));
        pappu = new Pappu(145, 280);
        pappu2 = new Pappu(145, 280);
        pappu3 = new Pappu(145, 280);
        pappu4 = new Pappu(145, 280);
        pappuStar = new Pappu(0,0);
        berries = new Berries(1300, 300);
        stars = new Star(500, 250);
        motions.addAll(treeBacks);
        motions.addAll(trees);
        motions.addAll(skies);
        motions.addAll(grasses);
        e.addAll(motions);
        e.addAll(branches);
        e.addAll(happy);
        e.addAll(angry);
        e.add(pappu);
        e.add(berries);
        e.add(stars);
    }

    @Override
    public void update() {
        for (entity entites : e) {
            x++;
            count++;
            entites.update();
        }
        for (Motion m : motions) {
            if (m.xCord <= -1000)
                m.xCord = 1000;
        }
        if (berries.xCord < -20) {
            berries.visible = true;
            berries.xCord = RandomFunction.getInt(2000, 4000);
            berries.yCord = RandomFunction.getInt(200, 400);
        }
        if (stars.xCord < -20) {
            stars.xCord = RandomFunction.getInt(1000, 6000);
            stars.yCord = RandomFunction.getInt(200, 400);
        }
        if (berries.isColldingWith(pappu)) {
//            pappu2.visible = true;
//            pappu3.visible = true;
//            pappu4.visible = true;
            berries.visible = false;
            pappu2.pappuVis(pappu.xCord, pappu.yCord);
            pappu3.pappuVis(pappu.xCord, pappu.yCord);
            pappu4.pappuVis(pappu.xCord, pappu.yCord);
            e.add(pappu2);
            e.add(pappu3);
            e.add(pappu4);

        }

        for (Branch b : branches) {
            if (b.xCord < -20) {
                b.visible = true;
                b.xCord = RandomFunction.getInt(900, 1500);
                if(RandomFunction.getInt(2)==0)
                b.yCord = RandomFunction.getInt(-400, -100);
                else
                    b.yCord = RandomFunction.getInt(100,400);
            }
//            if(stars.isColldingWith(pappu)) {
//                pappu.visible = false;
//                pappuStar.pappuVis(pappu.xCord, pappu.yCord);
//                e.add(pappuStar);
//            }
//                if(stars.xCord<-25){
//                    pappuStar.visible = false;
//                    pappu.visible = true;
//                } v bvbnnxnbxnhcghcgnv bvngnjfhnhthsdeewqesfdhyikuli;oop0-[9ikgnfg454q34
            if (pappu.isColldingWith(b) && pappu.visible == true) {
                branchX = b.xCord;
                branchY = b.yCord;
                treeB = -2 * x;
                treeB %= 1000;
                treeF = -6 * x;
                treeF %= 1000;
                grass = -6 * x;
                grass %= 1000;
                GamePanel.currentState = new ExitState();
            }
            if ((pappu2.isColldingWith(b)) || (pappu3.isColldingWith(b)) || (pappu4.isColldingWith(b)))
                b.visible = false;
        }
        for (Happy h : happy) {
            if (h.xCord <= RandomFunction.getInt(300, 700)) {
                h.happyJump();
            }
            if (h.xCord < 0) {
                h.visible = true;
                h.happyInvisible();
            }
            if (pappu.isColldingWith(h)) {
                h.visible = false;
                pappu.xCord += 30;
            }
        }
        for (Angry a : angry) {
                if (a.xCord <= RandomFunction.getInt(700, 2500)) {
                    a.angryJump();

                }
                if (a.xCord < 0) {
                    a.visible = true;
                    a.angryInvisible();
                }
                if (pappu.isColldingWith(a)) {
                    a.visible = false;
                    pappu.xCord -= 50;
                }
            }

        if (pappu.xCord < 0 || pappu.xCord > 1000 || pappu.yCord < 0 || pappu.yCord > 500)
            GamePanel.currentState = new MenuState();
    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.getHSBColor(217, 177, 186));
        G.fillRect(0, 0, 1000, 500);
        for (entity entities : e) {
            if (entities.visible) {
                G.drawImage(entities.getImages(), entities.xCord, entities.yCord, null);
            }
        }
    }

    @Override
    public void onKeyPressed(int getkeyCode) {
        if (getkeyCode == KeyEvent.VK_SPACE) {
            pappu.yVel = -5;
            pappu.yAcc = 1;
        }

    }
}
