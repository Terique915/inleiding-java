package H06;

import java.applet.Applet;
import java.awt.*;

public class Opdracht63 extends Applet {

    int max;
    int getal;
    int uitkomst;


    public void init() {
        max = 2147483647;
        getal= 2000;
        uitkomst= max+getal;

    }


    public void paint(Graphics g) {
        g.drawString(String.valueOf(uitkomst), 50, 100);
    }
}
