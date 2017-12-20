package tests.testng;

import module4.Calculator;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected Calculator calculator;

    @BeforeMethod(alwaysRun = true)
    public void beforeTest() {
             calculator = new Calculator();
    }
}
