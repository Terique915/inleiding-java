package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht116 extends Applet {
    @Override
    public void init() {
        setSize(400,400);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(90,90,100,100);
        g.drawOval(100,100,80,80);
        g.drawOval(110,110,60,60);
        g.drawOval(120,120,40,40);
        g.drawOval(130,130,20,20);

    }
}
