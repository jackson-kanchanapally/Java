import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

class TrafficLight extends JFrame implements ItemListener{
    JLabel lb1,lb2;
    JPanel np,cp;
    CheckboxGroup cbg;
    public TrafficLight (){
        setTitle("Traffic light simulator");
        setSize(600,400);
        setLayout(new GridLayout(2,1));
        np=new JPanel(new FlowLayout());
        cp=new JPanel(new FlowLayout());
        lb1=new JLabel();
        Font font=new Font("Verdana",Font.BOLD,70);
        lb1.setFont(font);
        np.add(lb1);
        add(np);
        Font fontR=new Font("Verdana",Font.BOLD,20);
        lb2=new JLabel("Select LIghts");
        lb2.setFont(fontR);
        cp.add(lb2);
        cbg=new CheckboxGroup();

        Checkbox rbn1=new Checkbox("Red Light",cbg,false);
        rbn1.setBackground(Color.RED);
        rbn1.setFont(fontR);
        cp.add(rbn1);
        rbn1.addItemListener(this);

        Checkbox rbn2=new Checkbox("ORange Light",cbg,false);
        rbn2.setBackground(Color.ORANGE);
        rbn2.setFont(fontR);
        cp.add(rbn2);
        rbn2.addItemListener(this);

        Checkbox rbn3=new Checkbox("Green Light",cbg,false);
        rbn3.setBackground(Color.GREEN);
        rbn3.setFont(fontR);
        cp.add(rbn3);
        rbn3.addItemListener(this);
        add(cp);
        setVisible(true);

         // to close the main window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void itemChange(ItemEvent i){
        Checkbox chk=cbg.getSelectedCheckbox();
        String str=chk.getLabel();
        char choice=str.charAt(0);
        switch(choice){
            case 'R': lb1.setText("STOP");
            lb1.setForeground(Color.RED);
            break;
            case 'O':lb1.setText("READY");
                     lb1.setForeground(Color.ORANGE);
                     break;
            case 'G':lb1.setText("GO");
                     lb1.setForeground(Color.GREEN);
                     break;
        }
    }
    public static void main(String[] args) {
        new TrafficLight();
    }
}
