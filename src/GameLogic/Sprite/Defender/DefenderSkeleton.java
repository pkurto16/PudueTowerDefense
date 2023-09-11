package src.GameLogic.Sprite.Defender;
import lombok.Builder;
import src.ObjectCustomization.ObjectType.Tower;
import src.ObjectCustomization.Traits.Upgrade;

@Builder
public abstract class DefenderSkeleton implements Tower {
    protected String[] upgrades;
    protected int[][] position;
    protected Upgrade[][] upgradePath;
    protected String imgPath;
}
