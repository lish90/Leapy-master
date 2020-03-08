import org.junit.Assert;
import org.junit.Test;

public class LeapYearCalculatorMust {

    @Test
    public void returnTypicalCommonYear() {
        //Arrange
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

        //Act
        boolean result = leapYearCalculator.calculate(2001);

        //Assert
        Assert.assertEquals(false, result);

    }

    @Test
    public void returnTypcialLeapYear() {
        //Arrange
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

        boolean result = leapYearCalculator.calculate(1996);

        Assert.assertEquals(true, result);

    }

    @Test
    public void returnAtypicalCommonYear() {
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

        boolean result = leapYearCalculator.calculate(1900);

        Assert.assertEquals(false, result);
    }
    
    @Test
    public void returnATypicalLeapYear() {
        LeapYearCalculator leapYearCalculator = new LeapYearCalculator();

        boolean result = leapYearCalculator.calculate(2000);

        Assert.assertEquals(true, result);
    }

}
