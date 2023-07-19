package Classes.Rewards;

import Classes.iGameItem;

public class BoneReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Bone");
    }
}
