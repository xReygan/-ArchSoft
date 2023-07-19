package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class PlatinumGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new PlatinumReward();
    }
}
