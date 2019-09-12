package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht45 extends Applet {


    public void init() {
        setBackground(Color.blue);

    }


    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillArc(100, 100, 150, 100,360,360);

    }
}
