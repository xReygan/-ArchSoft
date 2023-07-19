package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class PotatoGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new PotatoReward();
    }
}
