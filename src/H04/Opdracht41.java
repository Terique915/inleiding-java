package H04;
//Vragen
//Vraag 1:Wat is een platform?
//Antwoord: De combinatie van besturingsysyteem en processor
//Vraag 2:Waarom hoeft een programmeur in Java maar één keer een programma te schrijven voor verschillende platforms?
//Want dan zal Java de broncode vertalen naar bytcode die standard is voor alle platform
//Vraag 3:Wat is bytecode?
//Antwoord Tussental die door alle platform bekent is.
//Vraag 4:Wat doet JVM?
//Antwoord Java Virtual Mavchine is een vertaler die vertaalt bytcode naar machinetaal tijdens de uit voering van een applet
//Vraag 5:Met welke methode kun je een vierkant tekenen?
//Antwoord: Paint methode
//Vraag 6:Noem drie methodes waarmee je een cirkel kunt tekenen?
//Antwoord: Paint methode
//Vraag 7:Waarom worden opdrachten voor het scherm in paint() gezet en niet in een andere methode?


import java.applet.Applet;
import java.awt.*;

public class Opdracht41 extends Applet {


    public void init() {
        setSize(500,500);

    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 200, 100);
        g.drawLine(100,200,50,50);
        g.drawLine(100,200,200,100);

    }
}
