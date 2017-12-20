package tests.testng;

import org.testng.annotations.*;
import utils.Formatter;
import org.testng.asserts.SoftAssert;

public class NegativeTest extends BaseTest {

    @DataProvider(name = "DataProviderNegativeTest")
    public Object[][] dataForNegativeTest() {
        return new Object[][]{
                {"-1", true},
                {"1", false},
                {"0", false}
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("Negative test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Negative test finished");
    }

    @Test(dataProvider = "DataProviderNegativeTest", groups = {"Smoke"})
    public void isNegativeTest (String a, boolean result) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.isNegative(Formatter.convertStringLong(a)), result, "Number is a positive or zero.");
        softAssert.assertAll();
    }
}
