package utilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 15:46
 * To change this template use File | Settings | File Templates.
 *
 * @author Reshad Farid
 * @version 1.0
 *
 * This class is the core class for all the buttons used in the Application.
 */
public class CustomButton extends JButton {

    int red = 0;
    int green = 175;
    int blue = 206;

    Color kleur = new Color(red, green, blue);

    Dimension dimension = new Dimension(100, 80);

    public CustomButton(String text) {
        super(text);

        this.setBackground(kleur);
        this.setForeground(Color.WHITE);
        this.setPreferredSize(dimension);
        this.setFont(new Font("Tahoma", Font.PLAIN, 22));
        this.setBorder(null);
        this.setFocusPainted(false);
        this.setContentAreaFilled(true);
        this.setOpaque(true);

    }

}
