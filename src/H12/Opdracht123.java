package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Opdracht123 extends Applet {
    TextField textvaken[];
    Button okbutton;

    @Override
    public void init() {
        textvaken= new TextField[5];
        for (int i = 0; i <textvaken.length ; i++) {
            TextField textvak = new TextField();
            textvaken[i] = textvak;

        }
        for (int i = 0; i <textvaken.length ; i++) {
            add(textvaken[i]);


        }
        okbutton = new Button("OK");
        okbutton.addActionListener(new Okbutton());
        add(okbutton);

    }

    @Override
    public void paint(Graphics g) {

    }
    class Okbutton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            int[] getallen = new int[5];
            for (int i = 0; i < textvaken.length ; i++) {
                String input = textvaken[i].getText();
                int getal = Integer.parseInt(input);
                getallen[i] = getal;
            }
            Arrays.sort(getallen);
            for (int i = 0; i < textvaken.length ; i++) {
                textvaken[i].setText(String.valueOf(getallen[i]));

            }

        }
    }
}
