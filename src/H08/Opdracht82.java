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
    int Totaal;
    Button Meisjes;
    Button Jongens;
    Button Mannen;
    Button Vrouwen;
    public void init() {
        meisjes=0;
        jongens=0;
        mannen=0;
        vrouwen=0;
        Totaal=0;

        //Buttons
        Meisjes=new Button("Meisjes");
        Meisjes.addActionListener(new Meisjes());
        add(Meisjes);
        Jongens=new Button("Jongens");
        Jongens.addActionListener(new Jongens());
        add(Jongens);
        Mannen=new Button("Mannen");
        Mannen.addActionListener(new Mannen());
        add(Mannen);
        Vrouwen=new Button("Vrouwen");
        Vrouwen.addActionListener(new Vrouwen());
        add(Vrouwen);



    }


    public void paint(Graphics g) {

        g.drawString(String.valueOf(meisjes),120,150);
        g.drawString(String.valueOf(jongens),120,170);
        g.drawString(String.valueOf(mannen),120,190);
        g.drawString(String.valueOf(vrouwen),120,210);
        g.drawString(String.valueOf(Totaal+meisjes+jongens+mannen+vrouwen),120,230);

        g.drawString("aantal Meisjes:",20,150);
        g.drawString("aantal Jongens:",20,170);
        g.drawString("aantal Mannen:",20,190);
        g.drawString("aantal Vrouwen:",20,210);
        g.drawString("Totaal",20,230);






    }
    class Meisjes implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint(meisjes++);


        }
    }
    class Jongens implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            repaint(jongens++);

        }
    }
    class Mannen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint(mannen++);

        }
    }
    class Vrouwen implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            repaint(vrouwen++);

        }
    }
}
