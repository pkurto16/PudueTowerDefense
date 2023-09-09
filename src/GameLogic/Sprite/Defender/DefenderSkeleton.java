package src.GameLogic.Sprite.Defender;
import lombok.Builder;
import src.Interface.Tower;
@Builder
public abstract class DefenderSkeleton implements Tower {
    private String[] upgrades;
    private int[][] position;
    @Builder.Default
    private int[][] upgradePath = new int[4][2];
    private String imgPath;

}
