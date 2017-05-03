package PappuPakia.Entity;

import java.awt.*;

/**
 * Created by LENOVO on 25-02-2017.
 */
public abstract class entity {
   public int xCord;
   public int yCord;
   public int xVel = 0;
   public int yVel = 0;
   public int xAcc = 0;
   public int yAcc = 0;
   public boolean visible = true;
   protected Rectangle rect;

   public entity(int xCord, int yCord, int width, int height) {
      super();
      this.xCord = xCord;
      this.yCord = yCord;
      rect = new Rectangle();
      rect.setSize(width, height);
   }

   public void update() {
      this.xCord += this.xVel;
      this.yCord += this.yVel;
      this.xVel += this.xAcc;
      this.yVel += this.yAcc;
   }

   public boolean isColldingWith(entity otherEntity) {

      if(!this.visible || !otherEntity.visible) {
         return false;
      }

      this.updateRectLocation();
      otherEntity.updateRectLocation();

      return this.rect.intersects(otherEntity.rect);
   }

   private void updateRectLocation() {
      this.rect.setLocation(this.xCord, this.yCord);
   }


   abstract public Image getImages();


}
