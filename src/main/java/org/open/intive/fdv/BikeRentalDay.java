/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.open.intive.fdv;

/**
 *
 * @author jscruz
 */
public class BikeRentalDay extends BikeRental {

    private static final int CHARGE_PER_DAY = 20;

    public BikeRentalDay(int time) {
        super(time);
    }
    
    @Override
    int getCharge() {
        return CHARGE_PER_DAY;
    }
    
}
