package Controllers;

import Views.DBFrame;
import Views.FrameStack;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AbstractController {

    protected DBFrame frame;

    public AbstractController(DBFrame frame, boolean hasBackButton) {
        this.frame = frame;
        if (hasBackButton) {
            frame.setBackButtonActionListener(new BackButtonActionListener());
        }
    }

    private class BackButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            FrameStack.getInstance().pop();
        }
    }
}