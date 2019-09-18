package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht82 extends Applet {
    int meisjes;
    int jongens;
    int mannen;
    int vrouwen;
    Button Meisjes;
    Button Jongens;
    Button Mannen;
    Button Vrouwen;
    public void init() {
        meisjes=0;
        jongens=0;
        mannen=0;
        vrouwen=0;
        //Buttons
        Meisjes=new Button("Meisjes");
        add(Meisjes);
        Jongens=new Button("Jongens");
        add(Jongens);
        Mannen=new Button("Mannen");
        add(Mannen);
        Vrouwen=new Button("Vrouwen");
        add(Vrouwen);


    }


    public void paint(Graphics g) {


    }
    class Meisjes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            meisjes=meisjes+1;

        }
    }
}
