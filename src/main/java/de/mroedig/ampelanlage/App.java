package de.mroedig.ampelanlage;
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

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Mainklasse, die eine Ampelanlage initialisiert, zwei Ampeln hinzufügt, und
 * dann 20 mal schalten lässt
 *
 *
 */
public class App {

    public static void main(String[] args) {
        AmpelZentrale zentrale = new AmpelZentrale();
        Ampel a1 = new AmpelImpl(Ampelphase.ROT, "erste");
        Ampel a2 = new AmpelImpl(Ampelphase.GRUEN, "zweite");

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
