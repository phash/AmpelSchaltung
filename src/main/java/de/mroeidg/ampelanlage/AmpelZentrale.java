/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.mroeidg.ampelanlage;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Manuel
 */
public class AmpelZentrale {

    Set<Ampel> ampeln = new HashSet<>();
    Set<Ampel> nichtZuSchalten = new HashSet<>();

    public void addAmpel(Ampel neueAmpel) {
        ampeln.add(neueAmpel);
    }

    public void removeAmpel(Ampel zuEntfernendeAmpel) {
        ampeln.remove(zuEntfernendeAmpel);
    }

    public void updateAmpeln() {
        for (Ampel ampel : ampeln) {
            ampel.update();
        }
    }
}
