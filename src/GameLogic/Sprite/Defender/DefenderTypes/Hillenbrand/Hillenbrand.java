package src.GameLogic.Sprite.Defender.DefenderTypes.Hillenbrand;

import lombok.Builder;
import lombok.Data;
import src.GameLogic.Sprite.Defender.DefenderSkeleton;
import src.ObjectCustomization.Traits.Upgrade;

@Data
@Builder
public class Hillenbrand extends DefenderSkeleton {

    @Override
    public void setPosition() {

    }

    @Override
    public void upgrade() {

    }

    @Override
    public void animate() {

    }

    private void setupUpgradePath(){
        Upgrade[][] newUpgradePath = new Upgrade[2][4];
        newUpgradePath[0] = dataAnalysisPath();
        newUpgradePath[1] = techUpdatePath();
        super.setUpgradePath(newUpgradePath);
    }

    private Upgrade[] techUpdatePath() {
        //todo: make 4 levels of tech update upgrades and return
        return null;
    }

    private Upgrade[] dataAnalysisPath() {
        //todo: make 4 levels of data analysis upgrades and return
        return null;
    }
}
