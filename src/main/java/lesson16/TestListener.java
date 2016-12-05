package lesson16;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

/**
 * Created by siava on 25.11.2016.
 */
public class TestListener extends TestListenerAdapter{

    private static Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    public void onTestSuccess(ITestResult tr) {
        logger.info("writeForTestSuccess");
    }

    public void onTestFailure(ITestResult tr) {
        logger.error("FAAAILAAAAA");
    }

    public void onTestSkipped(ITestResult tr) {
        logger.info("skip");
    }
}