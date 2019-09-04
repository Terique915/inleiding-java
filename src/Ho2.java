import java.awt.*;
import java.applet.*;

public class Ho2 extends Applet {

    public void init() {
        setBackground(Color.blue);
    }

    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawString("Terique ", 50, 60 );
        g.drawString(" Tyrell ", 60, 70 );
        g.drawString(" Blijden", 70, 80 );
    }
}