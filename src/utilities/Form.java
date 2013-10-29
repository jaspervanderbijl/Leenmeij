package utilities;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: reshadfarid
 * Date: 29-10-13
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
public abstract class Form extends JPanel
{

    private static Form currentForm;

    public static Form getCurrentForm()
    {
        return Form.currentForm;
    }

    public static void setCurrentForm(Form form)
    {
        Form.currentForm = form;
    }

    protected Form()
    {

    }

    public void navigate(Form form)
    {
        if (form != null)
        {
            Container frame = this.getParent();
            if (frame != null)
            {
                frame.removeAll();
                frame.setVisible(false);
                frame.add(form);
                frame.setVisible(true);
                Form.currentForm = form;
            }
        }
    }

    public void runTask(Task task)
    {
        this.navigate(task.run(this));
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
    }

}