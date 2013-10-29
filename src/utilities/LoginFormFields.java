package utilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 17:32
 * To change this template use File | Settings | File Templates.
 */
public class LoginFormFields extends JPanel {

    private CustomTextField username;
    private CustomPasswordField password;

    public LoginFormFields() {

        this.setBackground(Color.white);

        username = new CustomTextField(10);
        password = new CustomPasswordField(10);

        add(new JLabel("Gebruikersnaam"));
        add(username);
        add(new JLabel("Wachtwoord"));
        add(password);


    }

}
