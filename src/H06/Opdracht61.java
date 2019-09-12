package H06;
//Vraag 1:Waarom is initialiseren van variabelen noodzakelijk?
//Antwoord:Dus die variabel kan een waarde krijgen om in te voeren in je broncode
//Vraag 2:Waarom is er typecasting noodzakelijk bij de conversie van een double naar een int?
//Antwoord:want met de conversie kan je informatie verloren dus met castyping zegt je dat je wil het conversie
//  doen en ook accepteerd dat je informatie verloort.
//Vraag 3:  Wat is de uitvoer van dit programma? Geef een verklaring.
//Antwoord: (8+8)/3=5.33333333(uitkomst) dan 5.3333333333 +20+20 the double word gebruik omdat we hebben met nummers achter
// de komma
//Vraag 4: Wat is de uitvoer van dit programma? Geef een verklaring.
//Antwoord:uitkoms=8+8/3
//Vraag 5:Wat is de uitvoer van dit programma? Geef een verklaring.
//Antwoord:dan word b gedeeld door c en darna opgetelt met a is dan de uitkomst. Daarna is uitkomst +20+20. dit komt door
//in wiskunde komd delenof vermenigvuldigen
import java.applet.Applet;
import java.awt.*;

public class Opdracht61  extends Applet {
    //Variabelen Declareren
    int a;
    int b;
    int c;
    int d;
    int bedrag;
    int uitkomst;


    public void init() {
        //Variabelen Initialiseren
        a=1;
        b=1;
        c=1;
        d=1;
        bedrag=113;
        uitkomst=bedrag/(a+b+c+d);


    }


    public void paint(Graphics g) {
        g.drawString("Terique"+ uitkomst,50,50);
        g.drawString("Jan"+ uitkomst,50,70);
        g.drawString("Ali"+uitkomst,50,90);
        g.drawString("Jeannette"+uitkomst,50,110);




    }
}
