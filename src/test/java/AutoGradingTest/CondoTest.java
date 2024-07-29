package AutoGradingTest;

import org.junit.Assert;
import org.junit.Test;
import RealEstate.*;

public class CondoTest {
    @Test
    public void testCondoGettersAndSetters() {
        Condo condo = new Condo();
        condo.setStreetAddress("123 Main St");
        condo.setZip("12345");
        condo.setBedCount(1);
        condo.setBathCount(1);
        condo.setSqFootage(1);
        condo.setFloorLevel(1);

        Assert.assertEquals("123 Main St", condo.getStreetAddress());
        Assert.assertEquals("12345", condo.getZip());
        Assert.assertEquals(1, condo.getBedCount());
        Assert.assertEquals(1, condo.getBathCount());
        Assert.assertEquals(1, condo.getSqFootage());
        Assert.assertEquals(1, condo.getFloorLevel());
    }

    @Test
    public void testNonEmptyCondoConstructor() {
        Condo condo = new Condo("123 Main St", "12345", 1, 1, 1, 1);

        Assert.assertEquals("123 Main St", condo.getStreetAddress());
        Assert.assertEquals("12345", condo.getZip());
        Assert.assertEquals(1, condo.getBedCount());
        Assert.assertEquals(1, condo.getBathCount());
        Assert.assertEquals(1, condo.getSqFootage());
        Assert.assertEquals(1, condo.getFloorLevel());
    }

    @Test
    public void testEmptyCondoConstructor() {
        Condo condo = new Condo();

        Assert.assertEquals("Property", condo.getStreetAddress());
        Assert.assertEquals("00000", condo.getZip());
        Assert.assertEquals(0, condo.getBedCount());
        Assert.assertEquals(0, condo.getBathCount());
        Assert.assertEquals(0, condo.getSqFootage());
        Assert.assertEquals(0, condo.getFloorLevel());
    }

    @Test
    public void testCalculateAppraiselPrice() {
        Condo condo = new Condo("123 Main St", "12345", 1, 1, 1, 1);
        int square_foot = condo.getSqFootage();
        int bedrooms = condo.getBedCount();
        int bathrooms = condo.getBathCount();
        int fullFloor = (int)Math.round(condo.getFloorLevel());
        int expected_total = (square_foot * 88) + (8_000 * bedrooms) + (10_000 * bathrooms) + (5_000 * fullFloor);
        
        condo.calculateAppraisalPrice();
        Assert.assertEquals(expected_total, condo.getAppraisalPrice());

    }
    
}