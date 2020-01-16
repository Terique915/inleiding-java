package H13;

import java.applet.Applet;
import java.awt.*;

public class PO13 extends Applet {

    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {
        int x = 30;
        int y = 50;
        int width = 80;
        int height = 80;
        int xstam = 50;
        int ystam = 130;
        int widthstam = 40;
        int heightstam = 100;
        tekenBoom( g,  x,  y,  width,   height, xstam,  ystam,  widthstam,  heightstam);


    }


    void tekenBoom(Graphics g, int x, int y, int width,  int height, int xstam, int ystam, int widthstam, int heightstam){
        g.drawOval(x,y,width,height);
        g.drawRect(xstam,ystam,widthstam,heightstam);
    }
}

