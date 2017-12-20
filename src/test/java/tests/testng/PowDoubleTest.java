package tests.testng;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import utils.Formatter;

public class PowDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderForPowTest")
    public Object[][] dataForPowTest() {
        return new Object[][]{
                {5, 2, 25},
                {0.9, 2, 0.81},
                {2, 9, 512},
                {10.635, 3.76, 7253.26},
                {2, -2, 0.25},
                {-2, 3, -8}
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("PowDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("PowDouble test finished");
    }

    @Test(dataProvider = "DataProviderForPowTest", groups = {"Regression"})
    public void powTest (double x, double y, double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.pow(x, y)), Formatter.round(expectedResult), "Invalid pow() result.");
        softAssert.assertAll();
    }
}
