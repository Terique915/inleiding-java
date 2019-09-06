package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht41 extends Applet {


    public void init() {
        setSize(500,500);

    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 200, 100);
        g.drawLine(100,200,50,50);
        g.drawLine(100,200,200,100);

    }
}
