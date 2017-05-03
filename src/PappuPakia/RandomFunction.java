package PappuPakia;

import java.util.Random;

/**
 * Created by LENOVO on 25-02-2017.
 */
public class RandomFunction {

   private static Random r;
    public static int  getInt(int x){
        if(r==null){
            r=new Random();
        }
        return r.nextInt(x);
    }
    public static int getInt(int x,int y){
        if(r==null){
            r=new Random();
        }
        return r.nextInt(y-x) + x;
    }

}
