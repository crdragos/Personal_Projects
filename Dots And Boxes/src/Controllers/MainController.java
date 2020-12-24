package Controllers;

import Views.MainMenuFrame;

public class MainController {
    public static void main(String[] args) {
        new MainMenuController(new MainMenuFrame("Dots and Boxes"), false);
    }
}
