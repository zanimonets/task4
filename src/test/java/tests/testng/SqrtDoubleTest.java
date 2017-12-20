package tests.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Formatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SqrtDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderSqrtDoubleTest")
    public Object[][] dataForSqrtTest()
    {
        return new Object[][]{
                {9.0,3.0},
                {0.0,0.0}
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("SqrtDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("SqrtDouble test finished");
    }

    @Test(dataProvider = "DataProviderSqrtDoubleTest", groups = {"Regression"})
    public void sqrtTest (Double x, Double expectedResult)
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.sqrt(x),
                expectedResult, "Invalid Sqrt() result");
        softAssert.assertAll();
    }
}
