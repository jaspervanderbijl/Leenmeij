package forms;

import utilities.Form;
import utilities.LoginFormFields;
import utilities.LoginMenu;

import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 15:53
 * To change this template use File | Settings | File Templates.
 */
public class LoginForm extends Form {

    private LoginFormFields loginFormFields = new LoginFormFields();
    private LoginMenu loginmenu = new LoginMenu();

    public LoginForm() {



        this.setBackground(Color.white);

        this.add(loginFormFields, BorderLayout.NORTH);
        this.add(loginmenu, BorderLayout.SOUTH);
        this.setLayout(null);
        loginFormFields.setBounds(375, 250, 270, 150);
        loginmenu.setBounds(315, 400, 400, 400);

    }

}
