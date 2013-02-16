/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package de.mroeidg.ampelanlage;

/**
 *
 * @author Manuel Ein Beobachter
 */
public class Ampel {

    private Ampelphase aktuellePhase;
    private String ampelName;

    public Ampel(Ampelphase aktuell, String ampelName) {
        this.aktuellePhase = aktuell;
        this.ampelName = ampelName;
    }

    public void update() {
        System.out.print("Ampel " + ampelName + " schaltet von: " + aktuellePhase);
        aktuellePhase = Ampelphase.getNaechstePhase(this.aktuellePhase);
        System.out.println(" auf: " + aktuellePhase);
    }

    public Ampelphase getAktuellePhase() {
        return aktuellePhase;
    }

    public void setAktuellePhase(Ampelphase aktuellePhase) {
        this.aktuellePhase = aktuellePhase;
    }

    public String getAmpelName() {
        return ampelName;
    }

    public void setAmpelName(String ampelName) {
        this.ampelName = ampelName;
    }
}
