package tests.testng;

import org.testng.annotations.*;
import utils.Formatter;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class PositiveTest extends BaseTest{

    @DataProvider(name = "DataProviderForPositiveTest")
    public Object[][] dataForPositiveTest() {
        return new Object[][]{
                {"-1", false},
                {"1", true},
                {"0", false}
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("Positive test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Positive test finished");
    }

    @Test(dataProvider = "DataProviderForPositiveTest", groups = {"Smoke"})
    public void isPositiveTest (String x, boolean result)
    {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.isPositive(Formatter.convertStringLong(x)), result, "Number is a negative.");
        softAssert.assertAll();
    }
}
