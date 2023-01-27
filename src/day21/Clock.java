package day21;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Clock {

    public static void main(String[] args) {

        ActionListener actionListener = new TimerListener();

//        Timer timer = new Timer(5000, actionListener)

        Timer timer = new Timer(3000, e -> {
            System.out.println("lamda expression");
        });
        timer.start();
    }
}
