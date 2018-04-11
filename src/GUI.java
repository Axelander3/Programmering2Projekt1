import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by alexander on 2018-02-23.
 */
public class GUI {
    private JTextField usernameTextField;
    private JButton loginButton;
    private JPanel mainPanel;
    private JPasswordField passwordPasswordField;

    public GUI() {
        JFrame frame = new JFrame("GUI");
        frame.setContentPane(mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        loginButton.addActionListener(new Main());
    }

    public JTextField getUsernameTextField() {
        return usernameTextField;
    }

    public JPasswordField getPasswordPasswordField() {
        return passwordPasswordField;
    }
}
