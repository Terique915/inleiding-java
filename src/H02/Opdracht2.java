package H02;
//H02
//Vraag 1: Wat is machinetaal?
//Mijn Antwoord: Machinetaal is een reeks opdravhten van nullen en enen die de computer processor wel begrijpt.
//Vraag 2:Welke drie hulpmiddelen heb je nodig om te programmeren?
//Mijn Antwoord: Eerst een tekstverwerker om broncode in te schreven.
//               Tweede een compiler. Meeste progameertalen bestaat uit een combinatie van Engelse woorden en tekens die de computer niet verstaat.
//               De compiler vertaalt je broncode die je heeft ingetikt naar machine taal.
//               Derde een linker. Een linker haalt stuk code uit een klassenbibliotheek en zet hem in je programma.
//Vraag 3: Hoe herken je opdrachten in de broncode?
//Mijn Antwoord:Hij staat tussen de code staat hij in middel van methode en eindigt altijd met een punt komma
//Vraag 4: Waartoe dienen de import-opdrachten?
//Mijn Antwoord: Dit gebruik de linker om in de klasse bibliotheek voorgedefenitief codes te halen.
//Vraag 5: Wat is een methode?
//Mijn Antwoord: Een methode is waar in je opdrachten kan geven om dingen in beeld te breng op je applet.

import java.applet.Applet;
import java.awt.*;

public class Opdracht2 extends Applet {

    public void init() {
        setBackground(Color.blue);


    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Terique Tyrell Blijden", 50, 60 );
    }
}
