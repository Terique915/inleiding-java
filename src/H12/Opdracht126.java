package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht126 extends Applet {
    TextField textvak;
    Button okbutton;
    int[] getallen = {2,2,2,2,2,2};
    int text;

    @Override
    public void init() {
        textvak=new TextField(10);
        add(textvak);
        okbutton=new Button("OK");
        okbutton.addActionListener(new Okbutton());
        add(okbutton);

    }

    @Override
    public void paint(Graphics g) {
        g.drawString(String.valueOf(text),50,70);
    }

    class Okbutton implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            String a= textvak.getText();
            int input = Integer.parseInt(a);
            for (int counter = 0; counter< getallen.length; counter++) {
                if (input==2){
                    text=counter;

                }

            }
            repaint();

        }


    }
}
