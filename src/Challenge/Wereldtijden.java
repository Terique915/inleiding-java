package Challenge;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wereldtijden extends Applet {
    TextField textvak;
    Button Toonbutton;
    int tijdinlondon;
    int tijdindubai;
    int tijdintokyo;
    int tijdinShanghai;


    @Override
    public void init() {
        setSize(400,400);
        textvak= new TextField("",10);
        textvak.addActionListener(new Toonbutton());
        add(textvak);
        Toonbutton = new Button("Toon Tijd");
        Toonbutton.addActionListener(new Toonbutton());
        add(Toonbutton);
        tijdinlondon=0;
        tijdindubai=0;
        tijdintokyo=0;
        tijdinShanghai=0;

    }

    @Override
    public void paint(Graphics g) {

        g.drawString("Tijd in London:" +  tijdinlondon +  ":00 uur",50,65);
        g.drawString("Tijd in Dubai:" +  tijdindubai  +  ":00 uur",50,95 );
        g.drawString("Tijd in Tokyo:" +   tijdintokyo  +  ":00 uur",50,125 );
        g.drawString("Tijd in Shanghai:" +   tijdinShanghai  +  ":00 uur",50,155 );
    }
    class Toonbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String s;
            s=textvak.getText();
            int Uur=Integer.parseInt(s);
            if (Uur>=0 && Uur <24){
                tijdinlondon= Uur-1;
                tijdindubai = Uur+2;
                tijdintokyo= Uur+7;
                tijdinShanghai= Uur+8;

            }
            repaint();

        }
    }
}
