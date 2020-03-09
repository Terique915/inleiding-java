package H13;

import java.applet.Applet;
import java.awt.*;

public class POH13 extends Applet {
    @Override
    public void init() {

    }

    @Override
    public void paint(Graphics g) {

        int x = 35;
        int y = 110;
        int xc = 10;
        int yc = 40;
        int width = 20;
        int height = 100;
        int widthc = 70;
        int heightc = 70;
        for (int i = 0; i < 5; i++) {
            tekenboom(g, x, y, xc, yc, width, height, widthc, heightc);
            y++;
            yc++;
            x+=100;
            xc+=100;
        }
        tekenboom(g, x-500, y+200, xc-500, yc+200, width, height, widthc, heightc);
        tekenboom(g, x-400, y+200, xc-400, yc+200, width, height, widthc, heightc);
        tekenboom(g, x-300, y+200, xc-300, yc+200, width, height, widthc, heightc);
        tekenboom(g, x-200, y+200, xc-200, yc+200, width, height, widthc, heightc);
        tekenboom(g, x-100, y+200, xc-100, yc+200, width, height, widthc, heightc);






    }

    void tekenboom(Graphics g, int x, int y, int xc, int yc ,int width, int height, int widthc, int heightc){
        g.drawRect(x,y,width,height);
        g.drawOval(xc,yc,widthc,heightc);

    }
}
