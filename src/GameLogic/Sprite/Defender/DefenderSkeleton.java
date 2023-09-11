package src.GameLogic.Sprite.Defender;
import lombok.Builder;
import src.ObjectCustomization.ObjectType.Tower;
import src.ObjectCustomization.Traits.Upgrade;

@Builder
public abstract class DefenderSkeleton implements Tower {
    private String[] upgrades;
    private int[][] position;
    private Upgrade[][] upgradePath;
    private String imgPath;

}
