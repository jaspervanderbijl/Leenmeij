package utilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 17:12
 * To change this template use File | Settings | File Templates.
 *
 * Core class for custom TextField
 *
 * @author Reshad Farid
 * @version 1.0
 *
 */
public class CustomTextField extends JTextField{


    public CustomTextField(int cols) {
        super(cols);

        this.setForeground(Color.BLACK);
        this.setFont(new Font("Tahoma", Font.PLAIN, 22));
        this.setForeground(Color.lightGray);

    }
}
