package tests.testng;

import utils.Formatter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DivDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderDivDoubleTest")
    public Object[][] paramForSumTest () {
        return new Object[][]{
                {100, 2, 50},
                {100, 3, 33.33},
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("DivDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("DivDouble test finished");
    }

    @Test(dataProvider = "DataProviderDivDoubleTest", groups = {"Smoke"})
    public void sumTest (double x, double y, double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.div(x, y)), expectedResult, "Invalid div() result");
        softAssert.assertAll();
    }
 }
