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
public class BikeRentalWeek extends BikeRental {

    private static final int CHARGE_PER_WEEK = 60;

    @Override
    int getCost() {
        return CHARGE_PER_WEEK;
    }
    
}
