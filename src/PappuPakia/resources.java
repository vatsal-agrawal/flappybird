package PappuPakia;

import javax.imageio.ImageIO;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.io.IOException;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class resources {
   public static Image[] pappu=new Image[7];
    public static Image log ;
    public static Image bg,plankbot,plankmid,planktop,stand,treeF,treeb,grass,ground,branch,cloud,apple,berries,star,angryPakia,happyPakia,gameOver,pappuStar;
    public static AudioClip defaultAudio = null;
    public static void Res() {
        try {
            resources.pappu[0] = ImageIO.read(Game.class.getResource("resources/img/pappuTwo.png"));
            resources.pappu[1] = ImageIO.read(Game.class.getResource("resources/img/pappuThree.png"));
            resources.pappu[2] = ImageIO.read(Game.class.getResource("resources/img/pappu Four.png"));
            resources.pappu[3] = ImageIO.read(Game.class.getResource("resources/img/pappuFive.png"));
            resources.pappu[3] = ImageIO.read(Game.class.getResource("resources/img/pappuSix.png"));
            resources.pappu[5] = ImageIO.read(Game.class.getResource("resources/img/pappuSeven.png"));
            resources.pappu[6] = ImageIO.read(Game.class.getResource("resources/img/pappueight.png"));
            resources.log = ImageIO.read(Game.class.getResource("resources/img/log.png"));
            resources.bg= ImageIO.read(Game.class.getResource("resources/img/bg_combined.png"));
            resources.planktop= ImageIO.read(Game.class.getResource("resources/img/plank_top.png"));
            resources.plankmid= ImageIO.read(Game.class.getResource("resources/img/plank_mid.png"));
            resources.plankbot= ImageIO.read(Game.class.getResource("resources/img/plank_bot.png"));
            resources.treeF= ImageIO.read(Game.class.getResource("resources/img/front_trees.png"));
            resources.treeb= ImageIO.read(Game.class.getResource("resources/img/back_trees.png"));
            resources.stand=ImageIO.read(Game.class.getResource("resources/img/stand.png"));
            resources.grass=ImageIO.read(Game.class.getResource("resources/img/grass.png"));
            resources.ground=ImageIO.read(Game.class.getResource("resources/img/ground.png"));
            resources.branch=ImageIO.read(Game.class.getResource("resources/img/branch.png"));
            resources.apple=ImageIO.read(Game.class.getResource("resources/img/apple.png"));
            resources.berries=ImageIO.read(Game.class.getResource("resources/img/berries.png"));
            resources.star=ImageIO.read(Game.class.getResource("resources/img/star.png"));
            resources.cloud=ImageIO.read(Game.class.getResource("resources/img/cloudsEdit.png"));
            resources.angryPakia=ImageIO.read(Game.class.getResource("resources/img/angry_pakia.png"));
            resources.happyPakia=ImageIO.read(Game.class.getResource("resources/img/happy_pakia.png"));
            resources.gameOver=ImageIO.read(Game.class.getResource("resources/img/GameOver.jpg"));
            resources.pappuStar=ImageIO.read(Game.class.getResource("resources/img/pappu FO.png"));
            resources.defaultAudio = Applet.newAudioClip(Game.class.getResource("resources/sound/jump2.ogg"));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
