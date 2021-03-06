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

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Manuel
 */
public class AmpelZentrale {

    Set<Ampel> ampeln = new HashSet<>();

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
