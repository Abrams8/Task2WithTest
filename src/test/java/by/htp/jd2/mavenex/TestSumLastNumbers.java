package by.htp.jd2.mavenex;

import org.junit.Assert;
import org.junit.Test;

public class TestSumLastNumbers {
    @Test
    public void TestSumLastTwoNumbers001() {
        int number = 5689;
        int realResult;
        int expectedResult = 17;
        realResult = Main.sumLastTwoNumbers(number);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void TestSumLastTwoNumbers002() {
        int number = 7586;
        int realResult;
        int expectedResult = 14;
        realResult = Main.sumLastTwoNumbers(number);
        Assert.assertEquals(expectedResult, realResult);
    }
}