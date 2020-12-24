package Controllers;

import Views.BoardFrame3x3;
import Views.FrameStack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardController3x3 extends AbstractController {

    public BoardController3x3(BoardFrame3x3 frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setBtnRestartActionListener(new RestartActionListener());
    }

    private class RestartActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrameStack.getInstance().pop();
            new BoardController3x3(new BoardFrame3x3("Dots and Boxes"), true);
        }
    }
}