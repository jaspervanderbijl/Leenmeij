package business;

import utilities.Form;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import forms.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 15:04
 * To change this template use File | Settings | File Templates.
 */
public class Application implements WindowListener {

    JFrame frame;

    public Application()
    {

        frame = new JFrame();
        frame.addWindowListener(this);
        frame.setSize(1024, 768);
        //frame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        LoginForm form = new LoginForm();

        frame.add(form);
        frame.setTitle("Invers");
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);



        Form.setCurrentForm(form);
    }

    public static void main(String[] args)
    {
        new Application();
    }

    @Override
    public void windowOpened(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowClosed(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowIconified(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
