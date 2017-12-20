package tests.testng;

import utils.Formatter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class MultDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderMultDoubleTest")
    public Object[][] paramForSumTest () {
        return new Object[][]{
                {5, 10, 50},
                {5.4, 2, 10.8},
                {5, 0, 0},
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("MultDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("MultDouble test finished");
    }

    @Test(dataProvider = "DataProviderMultDoubleTest", groups = {"Smoke"})
    public void sumTest (double x, double y, double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.mult(x, y)), expectedResult, "Invalid mult() result");
        softAssert.assertAll();
    }

}
