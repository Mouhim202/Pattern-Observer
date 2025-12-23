package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl1 implements Observer {
    private List<Double> history = new ArrayList<>();
    @Override
    public void update(int state) {
        System.out.println("===========ObserverImpl1=============");
        double tendency =Math.sqrt(state)*Math.cos(state);
        System.out.println("New state: " + state);
        System.out.println("Tendency: " + tendency);
        System.out.println("=============ObserverImpl1=============");


    }
}
