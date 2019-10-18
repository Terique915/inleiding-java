package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class POH11 extends Applet {
    TextField textvak;
    Button OKbutton;
    String stringtext;
    String tekst;
    int cijfer;

    public void init() {
        textvak = new TextField("", 10);
        OKbutton = new Button(" OK");
        OKbutton.addActionListener(new OKbutton());
        textvak.addActionListener(new OKbutton());
        tekst = "";
        add(textvak);
        add(OKbutton);

    }

    public void paint(Graphics g) {
        g.drawString(tekst, 50, 60);
    }

    class OKbutton implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            stringtext = textvak.getText();
            cijfer = Integer.parseInt(stringtext);
            switch (cijfer) {
                case 1:
                    tekst = "1x1=1";
                    tekst=  "1x2=2";
                    break;

                case 2:
                    tekst = "Slecht";
                    break;
                case 3:
                    tekst = "Slecht";
                    break;
                case 4:
                    tekst = "Onvoldoende";
                    break;
                case 5:
                    tekst = "Matig";
                    break;
                case 6:
                    tekst = "Voldoende";
                    break;
                case 7:
                    tekst = "Voldoende";
                    break;
                case 8:
                    tekst = "Goed";
                    break;

                case 9:
                    tekst = "Goede";
                    break;
                case 10:
                    tekst = "Goed";
                    break;
                default:
                    tekst="Alleen nummers tussen 1 en 10 intypen";
                    break;

            }
            repaint();
        }
    }
}