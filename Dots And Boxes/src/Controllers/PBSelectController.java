package Controllers;

import Views.BoardFrame3x3;
import Views.BoardFrame4x4;
import Views.PBSelectFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PBSelectController extends AbstractController {

    public PBSelectController(PBSelectFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setBtn3x3ActionListener(new Btn3x3ActionListener());
        frame.setBtn4x4ActionListener(new Btn4x4ActionListener());
    }

    private class Btn3x3ActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new BoardController3x3(new BoardFrame3x3("Dots and Boxes"), true);
        }
    }

    private class Btn4x4ActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new BoardController4x4(new BoardFrame4x4("Dots and Boxes"), true);
        }
    }
}
