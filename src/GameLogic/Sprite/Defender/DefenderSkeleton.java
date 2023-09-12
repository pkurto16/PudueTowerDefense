package src.GameLogic.Sprite.Defender;
import lombok.Builder;
import lombok.Data;
import src.ObjectCustomization.ObjectType.Tower;
import src.ObjectCustomization.Traits.Upgrade;

@Data
@Builder
public abstract class DefenderSkeleton {
    private String[] upgrades;
    private int[][] position;
    private Upgrade[][] upgradePath;
    private String imgPath;
    public void setPosition(){

    }
    public void upgrade(){

    }
    public void animate(){

    }

}
