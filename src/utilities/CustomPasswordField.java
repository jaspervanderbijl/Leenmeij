package utilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 17:26
 * To change this template use File | Settings | File Templates.
 */
public class CustomPasswordField extends JPasswordField {

    public CustomPasswordField(int cols) {
        super(cols);

        this.setForeground(Color.BLACK);
        this.setFont(new Font("Tahoma", Font.PLAIN, 22));
        this.setForeground(Color.lightGray);

    }

}
