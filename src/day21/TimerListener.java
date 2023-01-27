package day21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimerListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("3 sec timer ended");
    }
}
