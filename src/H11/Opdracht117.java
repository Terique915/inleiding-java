package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht117 extends Applet {
    @Override
    public void init() {
        setSize(620,620);
    }

    @Override
    public void paint(Graphics g) {
        g.drawOval(0,0,600,600);
        g.drawOval(10,10,580,580);
        g.drawOval(20,20,560,560);
        g.drawOval(30,30,540,540);
        g.drawOval(40,40,520,520);
       g.drawOval(50,50,500,500);
       g.drawOval(60,60,480,480);
       g.drawOval(70,70,460,460);

    }
}
