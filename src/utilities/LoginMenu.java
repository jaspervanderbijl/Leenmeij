package utilities;

import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import utilities.CustomButton;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 *
 * Core login menu class
 *
 * @author Reshad Farid
 * @version 1.0
 */
public class LoginMenu extends JPanel implements MouseListener, ActionListener {

    CustomButton login = new CustomButton("Log in"), afsluiten = new CustomButton("Afsluiten");

    Color wit = Color.WHITE;
    Color grijs = Color.DARK_GRAY;

    public LoginMenu() {

        this.setBackground(Color.white);

        login.addActionListener(this);
        login.addMouseListener(this);

        afsluiten.addActionListener(this);
        afsluiten.addMouseListener(this);

        this.setSize(400, 400);

        add(login);
        add(afsluiten);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
        Form form = ((Form) this.getParent());


        if (e.getSource() == login)
        {
            //form.runTask(new validateCredentials());
        }

        else if (e.getSource() == afsluiten)
        {
            System.exit(0);
        }

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
        Object src = (JButton) e.getSource();
        ((JButton) src).setForeground(grijs);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
        Object src = (JButton) e.getSource();
        ((JButton) src).setForeground(wit);
    }
}
