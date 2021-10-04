package by.htp.jd2.mavenex;

import org.junit.Assert;
import org.junit.Test;

public class TestSumFirstNumbers {
    @Test
    public void TestSumFirstTwoNumbers001() {
        int number = 1562;
        int realResult;
        int expectedResult = 6;
        realResult = Main.sumFirstTwoNumbers(number);
        Assert.assertEquals(expectedResult, realResult);
    }

    @Test
    public void TestSumFirstTwoNumbers002() {
        int number = 2689;
        int realResult;
        int expectedResult = 8;
        realResult = Main.sumFirstTwoNumbers(number);
        Assert.assertEquals(expectedResult, realResult);
    }
}
