package src.GameLogic.Sprite.Enemy;

import lombok.Data;
import src.ObjectCustomization.ObjectType.Balloon;
@Data
public abstract class EnemySkeleton {
    private int[] coords;
    private double speed;
    private double progress;
    private double health;
    private String type;
    public void changeHealth(int healthSubtracted){
        health -= healthSubtracted;
        if(health<=0){
            die();
        }

    }
    public void die(){
        //?
    }
}



