package tests.testng;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SumDoubleTest extends BaseTest {
    @DataProvider(name = "DataProviderForSumDoubleTest")
    public Object[][] dataForSumTest() {
        return new Object[][]{
                {5, 5, 10},
                {-5, -5, -10},
                {-5, 5, 0},
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("SumDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("SumDouble test finished");
    }

    @Test(dataProvider = "DataProviderForSumDoubleTest", groups = {"Smoke"})
    public void sumTest (double x, double y, double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.sum(x, y), expectedResult, "Invalid sum() result");
        softAssert.assertAll();
    }
}
