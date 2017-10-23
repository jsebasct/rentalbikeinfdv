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

    private int rentTime;

    /**
     * 
     * @return the cost of having rented the bike
     */
    abstract int getCost();

    //@Override
    int getCharge() {
        return this.getRentTime() * getCost();
    }
    
    void setRentTime(int time) {
        this.rentTime = time;
    }

    public int getRentTime() {
        return this.rentTime;
    }
}
