package AutoGradingTest;

import org.junit.Assert;
import org.junit.Test;

import RealEstate.House;

public class PropertyTest {

    @Test
    public void testCalculateAppraisalPrice() {
        House house = new House();
        house.setStreetAddress("123 Main St");
        house.setZip("12345");
        house.setBedCount(1);
        house.setBathCount(1);
        house.setSqFootage(1);
        house.setYardAcres(1);
        int expectedAppraisalPrice = 20_000;
        int actualAppraisalPrice = house.calculateAppraisalPrice();
        Assert.assertEquals(expectedAppraisalPrice, actualAppraisalPrice);
    }

}