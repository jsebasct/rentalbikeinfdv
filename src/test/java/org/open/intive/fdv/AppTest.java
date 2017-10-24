package org.open.intive.fdv;

import org.junit.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    /**
     * Rental by hour, charging $5 per hour
     * @throws java.lang.Exception
     */
    @Test
    public void testHourRent() throws Exception
    {
        BikeRental app = new BikeRentalHour(5);
        assertEquals(25, app.getTotalCost());
    }
    
    /**
     * Rental by day, charging $20 a day
     */
    @Test
    public void testDayRent() throws Exception {
        BikeRental app = new BikeRentalDay(5);
        assertEquals(100, app.getTotalCost());
    }
    
    /**
     * Rental by week, changing $60 a week
     */
    @Test
    public void testWeekRent() throws Exception {
        BikeRental app = new BikeRentalWeek(5);
        assertEquals(300, app.getTotalCost());
    }
    
    /**
     * 4. Family Rental, is a promotion that can include from 3 to 5 Rentals 
     * (of any type) with a discount of 30% of the total price
     */
    @Test
    public void testFamilyRent() throws Exception {
        BikeRentalFamily app = new BikeRentalFamily(3);
        app.addRental(new BikeRentalWeek(5));
        app.addRental(new BikeRentalDay(5));
        app.addRental(new BikeRentalHour(5));
        
        assertFalse(app.addRental(new BikeRentalHour(5)));
        //TODO: round behavior ?
        assertEquals(297, app.getTotalCost());
    }
    
    @Test(expected=BikeRentalNotEnoughData.class)
    public void testFamilyRentNotEnough() throws Exception {
        BikeRentalFamily app = new BikeRentalFamily(3);
        app.addRental(new BikeRentalWeek(5));
        app.addRental(new BikeRentalDay(5));
        //TODO: round behavior ?
        assertEquals(297, app.getTotalCost());
    }
}
