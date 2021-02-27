package Utils;

import junit.framework.AssertionFailedError;
import junit.framework.Test;

public class TestListener implements junit.framework.TestListener {
    @Override
    public void addError(Test test, Throwable throwable) {

    }

    @Override
    public void addFailure(Test test, AssertionFailedError assertionFailedError) {
        System.out.println("On test failure");
    }

    @Override
    public void endTest(Test test) {

    }

    @Override
    public void startTest(Test test) {
        System.out.println("On test start");

    }
}
