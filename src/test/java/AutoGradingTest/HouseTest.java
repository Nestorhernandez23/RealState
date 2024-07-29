package AutoGradingTest;

import org.junit.Assert;
import org.junit.Test;

import RealEstate.*;

public class HouseTest {
    @Test
    public void testHouseConstructor() {
        House house = new House("123 Main St", "sdfgs", 1, 1, 1, 1);
        Assert.assertEquals("123 Main St", house.getStreetAddress());
        Assert.assertEquals("sdfgs", house.getZip());
        Assert.assertEquals(1, house.getBedCount());
        Assert.assertEquals(1, house.getBathCount());
        Assert.assertEquals(1, house.getSqFootage());
        Assert.assertEquals(1, house.getYardAcres(), 0.0);
    }

    @Test
    public void testEmptyHouseConstructor() {
        House house = new House();
        Assert.assertEquals("Property", house.getStreetAddress());
        Assert.assertEquals("00000", house.getZip());
        Assert.assertEquals(0, house.getBedCount());
        Assert.assertEquals(0, house.getBathCount());
        Assert.assertEquals(0, house.getSqFootage());
        Assert.assertEquals(0.0, house.getYardAcres(), 0.0);
    }

    @Test
    public void testGetYardAcres() {
        House house = new House();
        Assert.assertEquals(0.0, house.getYardAcres(), 0.0);
    }

    @Test
    public void testSetYardAcres() {
        House house = new House();
        house.setYardAcres(0.5);
        Assert.assertEquals(0.5, house.getYardAcres(), 0.0);
    }

    @Test
    public void calculateAppraisalPriceMethod(){
        House house = new House("123 Main St", "12345", 1, 1, 1000, 1);
        house.calculateAppraisalPrice();
        int expectedAppraisalPrice = (1000 * 97) + (10000 * 1) + (12000 * 1) + (46000 * 1);
        int actualAppraisalPrice = house.calculateAppraisalPrice();
        Assert.assertEquals(expectedAppraisalPrice, actualAppraisalPrice);
    
    }
}