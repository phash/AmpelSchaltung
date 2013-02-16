/*
 * This programm is part of a series of tutorials. They are produced for educational
 * reasons. Nothing more. Use it wisely.
 * Copyright (C) 2013 Manuel Rödig
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.*/
package de.mroedig.ampelanlage;

/**
 *
 * @author Manuel
 *
 * die Ampel - hat nur eine updateMethode
 */
public class AmpelImpl implements Ampel {

    private Ampelphase aktuellePhase;
    private String ampelName;

    public AmpelImpl(Ampelphase aktuell, String ampelName) {
        this.aktuellePhase = aktuell;
        this.ampelName = ampelName;
    }

    @Override
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
