package by.htp.jd2.mavenex;

import org.junit.Assert;
import org.junit.Test;

public class TestEqualsTwoNumbers {
    @Test
    public void TestEqualsTwoNumbers001() {
        boolean expectedResult = true;
        boolean realResult;
        int numberOne = 5;
        int numberTwo = 5;
        realResult = Main.equalsSumTwoLastAndTwoSecondNumbers(numberOne, numberTwo);
        Assert.assertEquals(numberOne, numberTwo);
    }

    @Test
    public void TestEqualsTwoNumbers002() {
        boolean expectedResult = true;
        boolean realResult;
        int numberOne = 8;
        int numberTwo = 8;
        realResult = Main.equalsSumTwoLastAndTwoSecondNumbers(numberOne, numberTwo);
        Assert.assertEquals(numberOne, numberTwo);
    }
}
