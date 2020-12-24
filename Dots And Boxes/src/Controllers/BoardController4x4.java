package Controllers;

import Views.BoardFrame4x4;
import Views.FrameStack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BoardController4x4 extends AbstractController {

    public BoardController4x4(BoardFrame4x4 frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setBtnRestartActionListener(new RestartBtnActionListener());
    }

    private class RestartBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrameStack.getInstance().pop();
            new BoardController4x4(new BoardFrame4x4("Dots and Boxes"), true);
        }
    }
}
