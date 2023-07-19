package Classes.Rewards;

import Classes.ItemFabric;
import Classes.iGameItem;

public class CrystalGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new CristalReward();
    }
}
