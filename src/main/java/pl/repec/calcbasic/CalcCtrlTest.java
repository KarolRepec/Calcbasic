package pl.repec.calcbasic;


import org.junit.Assert;
import org.junit.Test;

public class CalcCtrlTest {

    @Test
    public void shouldPass() {

        CalcCtrl sut = new CalcCtrl();
        System.out.println("test addition");

        double result = sut.getResult(3.0,5.0, OperationType.ADDITION);

        Assert.assertEquals(5, result, 0.0);
    }


}