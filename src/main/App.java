package main;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new gui.MainMenu().setVisible(true);
        });
    }
}
