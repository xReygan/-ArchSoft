package Classes.Rewards;

import Classes.iGameItem;

public class PotatoReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Potato");
    }
}
