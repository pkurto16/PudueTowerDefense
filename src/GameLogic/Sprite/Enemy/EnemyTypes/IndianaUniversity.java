package src.GameLogic.Sprite.Enemy.EnemyTypes;

import lombok.Builder;
import lombok.Data;
import src.GameLogic.Sprite.Enemy.EnemySkeleton;
@Builder
@Data
public class IndianaUniversity extends EnemySkeleton {

    @Override
    public int getPosX() {
        return 0;
    }

    @Override
    public int getPosY() {
        return 0;
    }

    @Override
    public void changeHealth(int healthSubtracted) {

    }

    @Override
    public void die() {

    }
}
