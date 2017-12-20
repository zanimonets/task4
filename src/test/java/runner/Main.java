package runner;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.testng.TestNG;
import tests.junit.*;
import tests.testng.*;

public class Main {
    public static void main (String[] args) {
         //Run for junit
        Result result = JUnitCore.runClasses(MultLongTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.wasSuccessful());

     // Alternate start for testng (Also it's possible run tests with testng.xml)
     //   TestNG testng = new TestNG();
     //   testng.setTestClasses(new Class[]{TgDoubleTest.class});
     //   testng.run();
    }
}
