package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class SilverGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new SilverReward();
    }
}
