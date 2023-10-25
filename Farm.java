
import java.util.ArrayList;

public class Farm {
    public static void main(String args[]) {
        ArrayList<Animal> farm = new ArrayList<Animal>();
        farm.add(new Duck());
        farm.add(new Bear());
        farm.add(new Animal());
        farm.add(new Bird());
        farm.add(new Eagle());
        farm.add(new Eagle());
        farm.add(new GrizzlyBear());
        farm.add(new Hummingbird());
        doOldMcDonaldStuff(farm);
    }

    static void doOldMcDonaldStuff(ArrayList<Animal> farm) {
        for (int i=0; i<farm.size(); i++) {
            System.out.println(farm.get(i).makeNoise());
            System.out.println(farm.get(i).move(5));
        }
    }
}
