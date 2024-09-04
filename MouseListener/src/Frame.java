import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame implements MouseListener
{

    JLabel label;
    ImageIcon Chill;
    ImageIcon Crying;
    ImageIcon Pinch;
    ImageIcon Scared;

    Frame()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,600);
        this.setLayout(new FlowLayout());

        label = new JLabel();
        label.addMouseListener(this);

        Chill = new ImageIcon("Chill.png");
        Crying = new ImageIcon("Crying.png");
        Pinch = new ImageIcon("Pinch.png");
        Scared = new ImageIcon("Scared.png");

        label.setIcon(Chill);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) 
    {
       //Invoked when the mouse button has been clicked (either pressed or released)
       
    }

    @Override
    public void mouseEntered(MouseEvent e) 
    {
        //Invoked when the mouse enters a component
        label.setIcon(Scared);
    }

    @Override
    public void mouseExited(MouseEvent e) 
    {
       //Invoked when the mouse exits a component 
       label.setIcon(Chill);
    }

    @Override
    public void mousePressed(MouseEvent e) 
    {
        //Invoked when a mouse button has been pressed
        label.setIcon(Pinch);
    }

    @Override
    public void mouseReleased(MouseEvent e) 
    {
        //Invoked when a mouse button has been released
        label.setIcon(Crying);
    }
}