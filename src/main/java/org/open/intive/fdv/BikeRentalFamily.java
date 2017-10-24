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
public class BikeRentalFamily extends BikeRental {

    private int currentRental;
    private final BikeRental[] rentals;
    
    public BikeRentalFamily(int size) {
        super(size);//??
        this.currentRental = 0;
        rentals = new BikeRental[size];
    }

    boolean addRental(BikeRental bikeRental) {
        boolean res = false;
        if (currentRental < this.rentals.length) {
            this.rentals[currentRental++] = bikeRental;
            res = true;
        }
        return res;
    }

    @Override
    int getTotalCost() throws BikeRentalNotEnoughData{
        System.out.println("Current Rental:" + currentRental);
        
        if (currentRental == this.rentals.length) {
            return (int) (getCharge()*0.7);
        } else {
            throw new BikeRentalNotEnoughData();
        }
        
    }

    @Override
    int getCharge(){
        int result = 0;
        for (BikeRental br: rentals) {
            try {
                result += br.getTotalCost();
            } catch (Exception ex) {
                result += 0;
            }
        }
        return result;
    }
    
}
