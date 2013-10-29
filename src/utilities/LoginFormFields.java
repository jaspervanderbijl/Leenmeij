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
    private JLabel gebruikersnaam, wachtwoord;

    public LoginFormFields() {

        this.setBackground(Color.white);
        this.setLayout(null);

        username = new CustomTextField(10);
        username.setBounds(35, 20, 205, 40);

        password = new CustomPasswordField(10);
        password.setBounds(35, 90, 205, 40);

        gebruikersnaam = new JLabel("Gebruikersnaam");
        gebruikersnaam.setBounds(35, -10, 205, 40);
        gebruikersnaam.setFont(new Font("Tahoma", Font.PLAIN, 22));

        wachtwoord = new JLabel("Wachtwoord");
        wachtwoord.setBounds(35, 60, 205, 40);
        wachtwoord.setFont(new Font("Tahoma", Font.PLAIN, 22));

        add(gebruikersnaam);
        add(username);
        add(wachtwoord);
        add(password);


    }

}
