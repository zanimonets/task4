package tests.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Formatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TgDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderTgDoubleTest") public Object[][] dataForTgTest() {
        return new Object[][] { { 45.0, 1.62 } };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("TgDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("TgDouble test finished");
    }

     @Test(dataProvider = "DataProviderTgDoubleTest", groups = { "Regression", "Broken" })
     public void tgTest(Double x, Double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.tg(x)), expectedResult, "Invalid tg() result. Bug: Depends on cos() method");
        softAssert.assertAll();
    }
}