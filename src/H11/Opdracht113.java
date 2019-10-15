package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht113 extends Applet {
    @Override
    public void init() {
        setSize(400,400);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Fibonacci sequentie",30,40);
        g.drawString("1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 610............",30,70);
    }
}
