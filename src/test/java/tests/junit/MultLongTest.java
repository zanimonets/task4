package tests.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultLongTest extends BaseTest {
    private static final long X = 5L;
    private static final long Y = 10L;
    private static final long EXPECTED_RESULT = 50L;

    @Before
    public void setUp() {
        System.out.println("MultLong test started");
    }

    @After
    public void tearDown() {
        System.out.println("MultLong test finished");
    }

    @Test
    public void multLongTest() {
        Long actualResult = calculator.mult(X, Y);
        Assert.assertTrue(
                String.format("Invalid multiplication result '%s' + '%s' expected '%s', but founded '%s'",
                        X, Y, EXPECTED_RESULT, actualResult), actualResult == EXPECTED_RESULT);
    }
}
