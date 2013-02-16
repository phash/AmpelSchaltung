/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.mroedig.ampelanlage;

/**
 *
 * @author Manuel
 */
public enum Ampelphase {

    ROT, ROTGELB, GELB, GRUEN;

    static Ampelphase getNaechstePhase(Ampelphase aktuellePhase) {
        if (aktuellePhase.equals(ROT)) {
            return ROTGELB;
        }
        if (aktuellePhase.equals(ROTGELB)) {
            return GRUEN;
        }
        if (aktuellePhase.equals(GRUEN)) {
            return GELB;
        }
        return ROT;
    }
}
