import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.Scanner;

/**
 * Created by alexander on 2018-02-14.
 */
public class Main implements ActionListener {
    private static Game game;
    private static GUI gui;
    public static void main(String[] args) {
        game = new Game();
        gui = new GUI();


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (game.playerTryLogin(gui.getUsernameTextField().getText(), gui.getPasswordPasswordField().getText())) {
            System.out.println("Yes " + gui.getUsernameTextField().getText() + " " + gui.getPasswordPasswordField().getText());
        } else {
            System.out.println("NO " + gui.getUsernameTextField().getText() + " " + gui.getPasswordPasswordField().getText());
        }
    }
}
