package main;

import javax.swing.*;

public class Game {
    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setResizable(false);
        window.setSize(768, 576);
        window.setTitle("REMAIN");

        GamePanel gamePanel = new GamePanel();
        window.add(gamePanel);

        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true); // Make the window visible

        gamePanel.setupGame();
        gamePanel.startGameThread();
    }
}