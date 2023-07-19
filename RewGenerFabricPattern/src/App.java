import java.util.ArrayList;
import java.util.List;
import java.util.Random;
//import java.util.concurrent.ThreadLocalRandom;
import Classes.ItemFabric;
import Classes.Rewards.BoneGenerator;
import Classes.Rewards.CrystalGenerator;
import Classes.Rewards.GemGenerator;
import Classes.Rewards.GoldGenerator;
import Classes.Rewards.PlatinumGenerator;
import Classes.Rewards.PotatoGenerator;
import Classes.Rewards.SilverGenerator;

public class App {
    public static void main(String[] args) throws Exception {
        //Random rnd = ThreadLocalRandom.current();
        Random rnd = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new SilverGenerator());
        fabricList.add(new PlatinumGenerator());
        fabricList.add(new CrystalGenerator());
        fabricList.add(new PotatoGenerator());
        fabricList.add(new BoneGenerator());
        
        for (int i = 0; i < 20; i++) {
            int index = rnd.nextInt(fabricList.size());
            //int index = Math.abs(rnd.nextInt()%2)==0?0:1;
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
