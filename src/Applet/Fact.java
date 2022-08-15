import java.awt.*;
import java.applet.*;
import java.awt.event.*;

// <applet code="Fact" width=500 height=250></applet>
public class Fact extends Applet implements ActionListener{
Label l1,l2;
TextField t1,t2;
Button b1;
public void init()
{
    l1=new Label("enter number :");
    add(l1);
    t1=new TextField(10);
    add(t1);
    l2=new Label("factorial is ");
    add(l2);
    t2=new TextField(10);
    add(t2);
    b1=new Button("Compute");
}
public void actionPerformed (ActionEvent e){
    if(e.getSource()==b1)
    {
        int value=Integer.parseInt(t1.getText());
        int fact=factorial(value);
        t2.setText(String.valueOf(fact));
    }


}
int factorial(int n){
    if(n==0)
    {
        return 1;
    }
    else{
        return n*factorial(n-1);
    }
}
}
