package tests.testng;

import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class SubDoubleTest extends BaseTest {
    @DataProvider(name = "DataProviderForSubDoubleTest")
    public Object[][] dataForSumTest() {
        return new Object[][]{
                {-5, -5, 0},
                {5, 5, 0},
                {-5, 5, -10},
        };
    }

    @BeforeTest
    public void setUp() {
        System.out.println("SubDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("SubDouble test finished");
    }

    @Test(dataProvider = "DataProviderForSubDoubleTest", groups = {"Smoke"})
    public void sumTest (double x, double y, double expectedResult) {
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(calculator.sub(x, y), expectedResult, "Invalid sub() result");
        softAssert.assertAll();
    }
}
