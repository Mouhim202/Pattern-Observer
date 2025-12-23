import obs.ObservableImpl;
import obs.Observer;

public class Test2 {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        observable.subscribe((state)->{
            System.out.println("===============");
            System.out.println("State: "+state);
            System.out.println("===============");
        });
        observable.subscribe((state)->{
            System.out.println("===============");
            System.out.println("SQRT: "+Math.sqrt(state));
            System.out.println("================");
        });
        observable.setState(76);
        observable.setState(86);
    }
}
