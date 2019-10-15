package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht114 extends Applet {
    @Override
    public void init() {
        setSize(400,400);
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Tafel van 3 ",40,30);
        g.drawString("1*3=3",40,50);
        g.drawString("2*3=6",40,70);
        g.drawString("3*3=9",40,90);
        g.drawString("3*4=12",40,110);
        g.drawString("3*5=15",40,130);
        g.drawString("3*6=18",40,150);
        g.drawString("3*7=21",40,170);
        g.drawString("3*8=24",40,190);
        g.drawString("3*9=27",40,210);
        g.drawString("3*10=30",40,230);
    }
}
