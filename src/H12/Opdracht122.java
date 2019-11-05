package H12;

import java.applet.Applet;
import java.awt.*;

public class Opdracht122 extends Applet {
    Button knoppen[];

    @Override
    public void init() {
        knoppen = new Button [25];
        for (int i = 0; i < knoppen.length; i++) {
            Button knop = new Button("knop " + (i + 1));
            knoppen[i] = knop;
        }

        for (int i = 0; i < knoppen.length; i++) {
            add(knoppen[i]);
        }










    }




}
