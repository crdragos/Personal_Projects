package Controllers;

import Views.MainMenuFrame;
import Views.PBSelectFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuController extends AbstractController{

    public MainMenuController(MainMenuFrame frame, boolean hasBackButton) {
        super(frame, hasBackButton);
        frame.setStartBtnActionListener(new StartBtnActionListener());
        frame.setCloseBtnActionListener(new CloseBtnActionListener());
    }

    private class StartBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            new PBSelectController(new PBSelectFrame(), true);
        }
    }

    private class CloseBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
