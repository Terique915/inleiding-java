package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht42 extends Applet {

    public void init() {
        setSize(500,500);

    }


    public void paint(Graphics g) {
        g.drawRect(100,300,280,160);
        g.drawLine(100,300,300,155);
        g.drawLine(300,155,380,300);
    }
}
