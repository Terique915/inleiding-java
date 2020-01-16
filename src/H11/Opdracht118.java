package H11;

import java.applet.Applet;
import java.awt.*;

public class Opdracht118 extends Applet {

    @Override
    public void init() {
        setSize(500,500);
    }

    @Override
    public void paint(Graphics g) {
        int x=0;
        int y=0;
        int cirkel = 100;
        int lengte= 15;
        int breedte=15;
        for(int teller=0; teller < cirkel; teller++) {
            g.drawOval(lengte,breedte,x,y);
            breedte +=15;
            lengte +=15;



        }

    }
}
