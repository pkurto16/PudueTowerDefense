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
        super.upgradePath[0] = dataAnalysisPath();
        super.upgradePath[1] = techUpdatePath();
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
