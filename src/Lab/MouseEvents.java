import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

    class MouseEvents extends JFrame implements MouseListener{
        
        JLabel l1;
        public MouseEvents(){
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setSize(300,300);
            setLayout(new FlowLayout(FlowLayout.CENTER));
            l1=new JLabel();
            Font f=new Font("Verdana",Font.BOLD,20);
            l1.setFont(f);
            l1.setForeground(Color.BLACK);
            add(l1);
            addMouseListener(this);
            setVisible(true);
        }
        public void mouseExited(MouseEvent m)
        {
            l1.setText("Mouse Exited");
        }

        public void mouseEntered(MouseEvent m)
        {
            l1.setText("Mouse Entered");
        }

        public void mouseReleased(MouseEvent m)
        {
            l1.setText("Mouse Released");
        }

        public void mousePressed(MouseEvent m)
        {
            l1.setText("Mouse pressed");     
           }

        public void mouseClicked(MouseEvent e)
        {
            // l1.setText("Mouse clicked"+e);
            l1.setText("Mouse clicked");
        }

        public static void main(String args[])
        {
            MouseEvents em =new MouseEvents();
        }
}
