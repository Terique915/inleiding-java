package H13;

import java.applet.Applet;
import java.awt.*;

public class Opdracht132 extends Applet {
    int x;
    int y;
    int breedte;
    int hoogte;

    public void init() {
        x = 50;
        y = 50;
        breedte = 50;
        hoogte = 30;
        setSize(500, 500);
    }

    @Override
    public void paint(Graphics g) {

            int x = 50;
            int y = 50;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.red);
                    g.fillRect(x, y, breedte, hoogte);
                }
                else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, breedte, hoogte);

                }
                x += breedte;
            }
            x = 50;
            y += hoogte;
        }
}

