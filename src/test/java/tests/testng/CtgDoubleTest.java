package tests.testng;

import utils.Formatter;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CtgDoubleTest extends BaseTest{
    private static final String X ="10.0";
    private static final double EXPECTED_RESULT = 1.54;

    @BeforeTest
    public void setUp() {
        System.out.println("CtgDouble test started");
    }

    @AfterTest
    public void tearDown() {
        System.out.println("CthDouble test finished");
    }

    @Test(groups = {"Regression"})
    public void ctgTest () {
          Assert.assertEquals(Formatter.round(calculator.ctg(Formatter.convertStringDouble(X))),
                  EXPECTED_RESULT, "Invalid ctg result. Bug: ctg() function math tanh()");
    }
}
