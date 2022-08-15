import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import java.applet.*;

public class Divi extends Applet implements ActionListener{
    Label l1,l2,l3;
    TextField t1,t2,Result;
    Button b1;
    public void init()
    {
        l1=new Label("enter num 1");
        add(l1);
        t1=new TextField(10);
        add(t1);
        l2=new Label("enter num 2");
        add(l2);
        t2=new TextField(10);
        add(t2);
        l3=new Label("result");
        Result=new TextField(10);
        add(Result);
        b1=new Button("Divide");
        add(b1);
        b1.addActionListner(this);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource==b1){
        try{
            int val1=Integer.parseInt(t1.getText());
            int val2=Integer.parseInt(t2.getText());
            int result=val1/val2;
            Result.setText(String.valueOf(result));
        }
        catch(NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(this,"Not a number");
        }
        catch(ArithmeticException ae){
            JOptionPane.showMessageDialog(this,"Divided by zerro");
        }
    }
    }
}
