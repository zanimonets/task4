package tests.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Formatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SinDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderSinDoubleTest")
    public Object[][] dataForSinTest() {
        return new Object[][]{
                { 1.0, 0.84},
                {-2.0, -0.91 },
                { 0.0, 0.0 }
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("SinDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("SinDouble test finished");
    }

    @Test(dataProvider = "DataProviderSinDoubleTest", groups = {"Regression"})
    public void sinTest (Double x, Double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.sin(x)),
                expectedResult, "Invalid sin() result");
        softAssert.assertAll();
    }
}
