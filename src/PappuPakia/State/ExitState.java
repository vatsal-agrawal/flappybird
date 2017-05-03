package PappuPakia.State;

import PappuPakia.Entity.*;
import PappuPakia.GamePanel;
import PappuPakia.RandomFunction;
import PappuPakia.resources;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by LENOVO on 02-03-2017.
 */
public class ExitState extends state {


    private Pappu pappu;
//    public StageState stageState;
    private List<Branch> branch;
    private List<TreeBack> treeBack;

    private List<Grass> grasses;
    private List<Sky> skies;
    private List<Trees> trees;
    private List<entity> entities;
    private List<Motion> motions;
    private int yValue = 100;

    public ExitState(){
        super();
//        pappu = new ArrayList<>();
        entities = new ArrayList<>();
        motions = new ArrayList<>();
        skies = new ArrayList<>();
        skies.add(new Sky(0,0));
        skies.add(new Sky(1000,0));
//        treeBack.add()
        pappu = new Pappu(145,280);

        motions.addAll(skies);
        entities.addAll(motions);

        entities.add(pappu);
    }

    @Override
    public void update() {
//        count++;
//        count %=7;
        for (entity e : entities) {
            yValue += RandomFunction.getInt(5,15);

            e.update();
        }
//        for (Motion m : motions) {
//            if (m.xCord <= -1000)
//                m.xCord = 1000;
//        }
        if(yValue>500)
            GamePanel.currentState = new MenuState();
    }

    @Override
    public void render(Graphics G) {
        G.setColor(Color.getHSBColor(217, 177, 186));
        G.fillRect(0, 0, 1000, 500);
//        G.drawImage(resources.stand, 800, 105, null);
//        G.drawImage(resources.planktop, 700, 115, null);
//        G.drawImage(resources.plankmid,700, 200, null);
//        G.drawImage(resources.plankbot, 700, 300, null);
//        G.drawImage(resources.log,150,320,null);
//        G.drawImage(resources.pappu[count],pappu.xCord,280,null);
//        G.drawImage(resources.treeb,treeBack.xCord,0,null);
//        G.drawImage(resources.treeb,treeBack.xCord + 1000,0,null);
//        G.drawImage(resources.treeF,trees.xCord,0,null);
//        G.drawImage(resources.treeF,trees.xCord + 1000,0,null);
//        G.drawImage(resources.cloud,sky.xCord,sky.yCord,null);
//        G.drawImage(resources.cloud,sky.xCord + 1000,sky.yCord,null);
//        G.drawImage(resources.branch,branch.xCord,branch.yCord,null);
//        G.drawImage(resources.ground,grass.xCord,grass.yCord,null);
//        G.drawImage(resources.ground,grass.xCord+1000,grass.yCord,null);
        G.drawImage(resources.treeb, StageState.treeB, 0, null);
        G.drawImage(resources.treeb, StageState.treeB + 1000, 0, null);
        G.drawImage(resources.treeF, StageState.treeF, 0, null);
        G.drawImage(resources.treeF, StageState.treeF + 1000, 0, null);
        G.drawImage(resources.ground, StageState.grass, 0, null);
        G.drawImage(resources.ground, StageState.grass + 1000, 0, null);

        for (entity e : entities){
            if(e.getImages() == resources.cloud)
                G.drawImage(e.getImages(), e.xCord, -100, null);
            if(e.getImages() != resources.cloud)
                G.drawImage(e.getImages(),StageState.pappuX,yValue, null);
        }

        G.drawImage(resources.branch, StageState.branchX, StageState.branchY, null);
    }

    @Override
    public void onKeyPressed(int getkeyCode) {

    }
}