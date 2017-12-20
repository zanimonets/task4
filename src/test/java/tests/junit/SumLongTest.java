package tests.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SumLongTest extends BaseTest{
    private static final long X = 5L;
    private static final long Y = 10L;
    private static final long EXPECTED_RESULT = 15L;

    @Before
    public void setUp() {
        System.out.println("SumLong test started");
    }

    @After
    public void tearDown() {
        System.out.println("SumLong test finished");
    }

    @Test
    public void sumLongTest() {
        Long actualResult = calculator.sum(X, Y);
        Assert.assertTrue(
                String.format("Invalid summarize result '%s' + '%s' expected '%s', but founded '%s'",
                        X, Y, EXPECTED_RESULT, actualResult), actualResult == EXPECTED_RESULT);
    }
}
