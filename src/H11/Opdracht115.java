package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht115 extends Applet {
    @Override
    public void init() {
        setSize(400,400);
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(20,20,30,30);
        g.drawRect(50,50,30,30);
        g.drawRect(80,80,30,30);
        g.drawRect(110,110,30,30);
        g.drawRect(140,140,30,30);
    }
}
