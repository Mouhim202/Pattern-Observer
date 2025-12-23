import obs.ObservableImpl;
import obs.Observer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test2 {
    public static void main(String[] args) {
        ObservableImpl observable=new ObservableImpl();
        Button button = new Button("OK");
        button.addActionListener((e) -> {
            System.out.println("................");

        });
    }
}
