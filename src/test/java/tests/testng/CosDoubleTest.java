package tests.testng;

import utils.Formatter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CosDoubleTest extends BaseTest {

    @DataProvider(name = "DataProviderForCosDoubleTest")
    public Object[][] paramForCosTest () {
        return new Object[][]{
                {"1", "0.54"},
                {"-1", "0.54"},
                {"0.00", "1.00"},
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("CosDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("CosDouble test finished");
    }

    @Test(dataProvider = "DataProviderForCosDoubleTest", groups = {"Regression"})
    public void cosTest (String a, String b) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(Formatter.round(calculator.cos(Formatter.convertStringDouble(a))), Formatter.convertStringDouble(b), "Invalid cos. Bug: cos() method math sin()");
        softAssert.assertAll();
    }
}
