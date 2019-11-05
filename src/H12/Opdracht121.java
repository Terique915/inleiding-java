package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht121 extends Applet{
    double cijfer[];
    double gemiddelde;

    public void init() {
        cijfer = new double [10];
        cijfer [0]= 7.3;
        cijfer [1]= 8;
        cijfer [2]= 6.1;
        cijfer [3]= 4.3;
        cijfer [4]= 5.4;
        cijfer [5]= 6.8;
        cijfer [6]= 9;
        cijfer [7]= 8.5;
        cijfer [8]= 7.8;
        cijfer [9]= 9.2;
        gemiddelde= (7.3+8+6.1+4.3+5.4+6.8+9+8.5+7.8+9.2)/10;


    }

    @Override
    public void paint(Graphics g) {
        g.drawString(cijfer[0]+" ",50,40);
        g.drawString(cijfer[1]+" ",50,60);
        g.drawString(cijfer[2]+" ",50,80);
        g.drawString(cijfer[3]+" ",50,100);
        g.drawString(cijfer[4]+" ",50,120);
        g.drawString(cijfer[5]+" ",50,140);
        g.drawString(cijfer[6]+" ",50,160);
        g.drawString(cijfer[7]+" ",50,180);
        g.drawString(cijfer[8]+" ",50,200);
        g.drawString(cijfer[9]+" ",50,220);
        g.drawString("gemiddelde:",110,100);
        g.drawString(String.valueOf(gemiddelde),190,100);



    }
}

