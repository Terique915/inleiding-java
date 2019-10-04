package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;





    public class Opdracht104 extends Applet {
        TextField textvak;
        Button OKbutton;
        String stringtext;
        String tekst;
        int maandnummer;

        public void init() {
            textvak = new TextField("", 10);
            OKbutton = new Button(" OK");
            OKbutton.addActionListener(new OKbutton());
            textvak.addActionListener( new OKbutton() );
            tekst = "";
            add(textvak);
            add(OKbutton);

        }

        public void paint(Graphics g) {
            g.drawString(tekst, 50, 60 );
        }

        class OKbutton implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                stringtext = textvak.getText();
                maandnummer = Integer.parseInt( stringtext);
                switch(maandnummer) {
                    case 1:
                        tekst= "Januari 31 dagen";
                        break;

                    case 2:
                        tekst = "Februari 28 dagen";
                        break;
                    case 3:
                        tekst = "Maart 31 dagen";
                        break;
                    case 4:
                        tekst = "April 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus 31 dagen";
                        break;

                    case 9:
                        tekst="Septmeber 30 dagen";
                        break;
                    case 10:
                        tekst= "Oktober 31 dagen";
                        break;
                    case 11:
                        tekst="November 30 dagen";
                        break;
                    case 12:
                        tekst="December 31 dagen";
                        break;
                }
                repaint();
            }
        }
}
