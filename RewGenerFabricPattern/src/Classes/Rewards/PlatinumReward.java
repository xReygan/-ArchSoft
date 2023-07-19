package Classes.Rewards;

import Classes.iGameItem;

public class PlatinumReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Platinum");
    }
}
