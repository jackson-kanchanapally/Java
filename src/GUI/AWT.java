import java.awt.*;

public class AWT {
    AWT() {
        Frame f = new Frame();

        Label l = new Label("Enter email");

        Button btn = new Button("Submit");

        TextField t = new TextField();

        l.setBounds(20, 80, 80, 30);
        t.setBounds(20, 100, 80, 30);
        btn.setBounds(100, 100, 80, 30);

        f.add(l);
        f.add(t);
        f.add(btn);

        f.setSize(400,400);

        f.setTitle("Learn");
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        AWT a=new AWT();
    }
}