package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


@SuppressWarnings("serial")
public class POH12 extends Applet {
    TextField nameField, numberField;
    Button okbutton;
    String namenArray[], numberArray[], error;
    Label nameLabel, numberLabel;
    boolean errorbericht;
    int index , i;



    public void init(){
        setSize(500, 500);
        error = "";
        errorbericht = false;
        index = 0;
        i = 0;
        namenArray = new String [10];
        numberArray = new String [10];

        nameLabel = new Label ("Naam");
        add (nameLabel);
        nameField = new TextField ("", 20);
        add (nameField);

        numberLabel = new Label (" Nummer");
        add(numberLabel);
        numberField = new TextField ("", 20);
        add(numberField);

        okbutton = new Button ("OK");
        add (okbutton);
        okbutton.addActionListener (new okButtonListener());

    }



    class okButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            namenArray[index] = nameField.getText ();
            numberArray[index] = numberField.getText ();
            if (!namenArray[index].equals ("") && !numberArray[index].equals ("")) {
                if (index == 10) {
                    for (i =0; i < namenArray.length; i++) {
                        namenArray[i] = "";
                    }
                    for (i = 0; i < numberArray.length; i ++){
                        namenArray[i] = "";
                    }
                }
                index++;
            }
            else {
                errorbericht = true;
                error = "Eerst de naam en daarna de nummer";
            }
            nameField.setText("");
            numberField.setText("");
            repaint ();
        }
    }
    public void paint(Graphics g){
        int y = 30;
        if (errorbericht == false) {
            if (index < 10) {
                g.drawString (" " + index + " of 10", 50, 50);
            }
            if (index == 10) {
                for (int i = 0; i < index; i++) {
                    y += 20;
                    g.drawString ("First name:  " + namenArray[i] + "   " + "Phone number:  " + numberArray[i], 35, y);
                }
                index = 0;

            }
        } else {
            g.drawString (" " + index + "of 10",50   ,50 );
            g.drawString ("" + error, 50, 80);
            errorbericht = false;
        }
    }
}