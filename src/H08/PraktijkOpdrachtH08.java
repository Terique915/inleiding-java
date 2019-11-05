package H08;

import javax.swing.*;
import javax.xml.crypto.dom.DOMCryptoContext;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PraktijkOpdrachtH08 extends Applet {
    TextField textvak;
    TextField textvak2;
    Button V;
    Button D;
    Button P;
    Button M;
    double uitkomst;


    public void init() {
        setSize(500, 500);
        textvak = new TextField(20);
        add(textvak);
        textvak2 = new TextField(20);
        add(textvak2);
        V = new Button("*");
        V.addActionListener(new V());
        add(V);
        D = new Button("/");
        D.addActionListener(new D());
        add(D);
        P = new Button("+");
        P.addActionListener(new P());
        add(P);
        M = new Button("-");
        M.addActionListener(new M());
        add(M);
        uitkomst=0;


    }


    public void paint(Graphics g) {

    }

    class V implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String a = textvak.getText();
            String b = textvak2.getText();
            double c = Double.parseDouble(a);
            double d = Double.parseDouble(b);
            uitkomst= c*d;
            textvak.setText(String.valueOf(uitkomst));
            textvak2.setText("");




        }

    }

    class D implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String d =textvak.getText();
            String f =textvak2.getText();
            double s =Double.parseDouble(d);
            double t =Double.parseDouble(f);
            uitkomst= s/t;
            textvak.setText(String.valueOf(uitkomst));
            textvak2.setText("");
        }
    }
    class P implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String p=textvak.getText();
            String q =textvak2.getText();
            double o=Double.parseDouble(p);
            double r= Double.parseDouble(q);
            uitkomst= o+r;
            textvak.setText(String.valueOf(uitkomst));
            textvak2.setText("");

        }
    }
    class M implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String m=textvak.getText();
            String n=textvak2.getText();
            double l=Double.parseDouble(m);
            double k=Double.parseDouble(n);
            uitkomst= l-k;
            textvak.setText(String.valueOf(uitkomst));
            textvak2.setText("");


        }
    }

}