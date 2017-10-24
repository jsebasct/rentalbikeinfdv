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
public abstract class BikeRental {

    private final int rentTime;

    public BikeRental(int time) {
        this.rentTime = time;
    }
    
    /**
     * 
     * @return the cost of having rented the bike per unit
     */
    abstract int getCharge();

    int getTotalCost() throws BikeRentalNotEnoughData {
        return this.getRentTime() * getCharge();
    }

    private int getRentTime() {
        return this.rentTime;
    }
}
