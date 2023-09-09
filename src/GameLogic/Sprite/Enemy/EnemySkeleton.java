package src.GameLogic.Sprite.Enemy;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import src.Interface.Balloon;
@Getter
@Builder
@Data
public class EnemySkeleton implements Balloon {
    private int posX;
    private int posY;
}



