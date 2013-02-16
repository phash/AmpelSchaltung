package de.mroeidg.ampelanlage;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        AmpelZentrale zentrale = new AmpelZentrale();
        Ampel a1 = new Ampel(Ampelphase.ROT, "erste");
        Ampel a2 = new Ampel(Ampelphase.GRUEN, "zweite");

        zentrale.addAmpel(a1);
        zentrale.addAmpel(a2);

        for (int i = 0; i < 20; i++) {
            try {
                System.out.println("Iteration Nr.: " + i);
                zentrale.updateAmpeln();
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
