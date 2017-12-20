package tests.junit;

import module4.Calculator;
import org.junit.After;
import org.junit.Before;

public class BaseTest {
    protected Calculator calculator;

    @Before
    public void beforeMethod() {
          calculator = new Calculator();
    }

}
