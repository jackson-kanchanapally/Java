import java.awt.*;

public class Frames extends Frame{

        Frames()
        {
            Button btn=new Button("Submit");
    
            btn.setBounds(110,110,80,35);
            add(btn);
           
            setSize(500,500);
            setTitle("App!!");
            setLayout(null);
            setVisible(true);
        }
        public static void main(String[] args) {
            Frames b=new Frames();
            
        }
    }
