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
public class BikeRentalNotEnoughData extends Exception {
    public BikeRentalNotEnoughData() {
        super("Not Enough Rentals added");
    }
}
