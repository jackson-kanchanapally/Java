import java.awt*;
import java.applet.*;
// <applet code="Simple" width=500 height=250></applet>

public class Simple extends Applet {
    public void paint(Graphics g){
        g.setColor(Color.blue);
        Font font=new Font("Arial",Font.BOLD,16);
        g.setFont(font);
        g.drawString("first applet",60,110);
    }
}
