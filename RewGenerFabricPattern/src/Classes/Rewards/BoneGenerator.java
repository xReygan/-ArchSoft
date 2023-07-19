package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class BoneGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new BoneReward();
    }
}
