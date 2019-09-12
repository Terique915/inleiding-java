package H04;

import java.applet.Applet;
import java.awt.*;

public class Opdracht43 extends Applet {


    public void init() {
        setSize(500,500);

    }


    public void paint(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(80,100,20,500);
        g.setColor(Color.red);
        g.fillRect(100,100,300,70);
        g.setColor(Color.white);
        g.fillRect(100,170,300,70);
        g.setColor(Color.blue);
        g.fillRect(100,240,300,70);


    }
}
