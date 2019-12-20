package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht131  extends Applet {

    @Override
    public void init() {


    }

    public void paint (Graphics g ) {
        int x1, y1, x2, y2, x3,y3;
        x1 = x2 = x3 = 200;
        y1 = y2 = y3 = 180;
        for (int i = 0; i < 100; i++) {
            driehoek (g, x1, y1, x2, y2, x3, y3);
            x3++;
            x2--;
            y1--;
            y2++;
            y3++;
        }

        driehoek (g, x1, y1, x2, y2, x3, y3);
    }

    void driehoek(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3) {
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y2, x3, y3);
        g.drawLine(x3, y3, x1, y1);

    }



    }


