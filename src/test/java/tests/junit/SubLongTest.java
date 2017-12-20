package tests.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubLongTest extends BaseTest {
    private static final long X = 10L;
    private static final long Y = 5L;
    private static final long EXPECTED_RESULT = 5L;

    @Before
    public void setUp() {
        System.out.println("SubLong test started");
    }

    @After
    public void tearDown() {
        System.out.println("SubLong test finished");
    }

    @Test
    public void subLongTest() {
        Long actualResult = calculator.sub(X, Y);
        Assert.assertTrue(
                String.format("Invalid subtraction result '%s' + '%s' expected '%s', but founded '%s'",
                        X, Y, EXPECTED_RESULT, actualResult), actualResult == EXPECTED_RESULT);
    }
}


