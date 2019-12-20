package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht133 extends Applet {

    boolean Wall;
    Button bakstenen;
    Button bettonblokken;
    int verticaalstenen, horizonstenen;
    int breedte, hoogte, verticaal, horizon;


    public void init() {
        setSize (800, 800);
        bakstenen = new Button ("Rodemuur");
        bakstenen.addActionListener (new Rodemuur ());
        add (bakstenen);
        Wall = false;
        bettonblokken = new Button ("bettonblokken");
        add (bettonblokken);
        bettonblokken.addActionListener (new Bettonblokken());



    }


    public void paint(Graphics g) {
        int x = 50; int y = 50;
        if (Wall) {
            for (verticaal = 0; verticaal < horizonstenen; verticaal++) {
                for (horizon = 0; horizon < horizonstenen; horizon++) {

                    g.setColor(Color.red);
                    g.fillRect (x, y, breedte, hoogte);
                    g.setColor (Color.black);
                    g.drawRect (x, y, breedte, hoogte);
                    x += breedte;
                }
                y += hoogte;
                x = 50;

            }
        }
    }
    class Rodemuur implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breedte = 50;
            hoogte = 25;
            horizonstenen = 10;
            verticaalstenen = 15;
            getGraphics().setColor(Color.red);
            Wall = true;
            repaint ();

        }
    }

    class Bettonblokken implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            breedte = 40;
            hoogte = 20;
            horizonstenen = 15;
            verticaalstenen = 15;
            getGraphics().setColor(Color.GRAY);
            Wall = true;
            repaint ();
        }
    }
}

