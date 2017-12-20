package tests.junit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class DivLongTest extends BaseTest {
    private int rowId;
    private Long expectedResult;
    private List<Long> values;

    public  DivLongTest (int rowId, List<Long> values, Long expectedResult) {
        this.rowId = rowId;
        this.values = values;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> getParameters() {
        return Arrays.asList(new Object[][]{
                {1, new ArrayList<Long>(Arrays.asList(10L, 5L)), 2L},
                {2, new ArrayList<Long>(Arrays.asList(-10L, 6L)), -1L},
                {3, new ArrayList<Long>(Arrays.asList(10l, 0l)), null}
        });
    }

    @Before
    public void setUp() {
        System.out.println("DivLong test started");
    }

    @After
    public void tearDown() {
        System.out.println("DivLong test finished");
    }

    @Test
    public void divLongTest() {
        Long actualResult = calculator.div(values.get(0), values.get(1));
        Assert.assertTrue(String.format("Row Id: '%s': Invalid division result '%s' / '%s' expected '%s', but founded '%s'",
                rowId, values.get(0), values.get(1), expectedResult, actualResult), actualResult == expectedResult);
    }

}
