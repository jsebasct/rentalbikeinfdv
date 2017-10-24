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
public class BikeRentalHour extends BikeRental {

    private static final int CHARGE_PER_HOUR = 5;

    public BikeRentalHour(int time) {
        super(time);
    }
    
    @Override
    int getCharge() {
        return CHARGE_PER_HOUR;
    }
    
}
