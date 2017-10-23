package org.open.intive.fdv;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHourRent()
    {
        BikeRental app = new BikeRentalHour();
        app.setRentTime(5);
        assertEquals(25, app.getCharge());
    }
    
    public void testDayRent() {
        BikeRental app = new BikeRentalDay();
        app.setRentTime(5);
        assertEquals(100, app.getCharge());
    }
    
    public void testWeekRent() {
        BikeRental app = new BikeRentalWeek();
        app.setRentTime(5);
        assertEquals(300, app.getCharge());
    }
}
