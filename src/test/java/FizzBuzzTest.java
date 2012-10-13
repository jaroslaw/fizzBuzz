import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void itShouldReturnFizzForDivisibleBy3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Fizz", fizzBuzz.NumberToString(3));
        Assert.assertEquals("Fizz", fizzBuzz.NumberToString(12));
    }

    @Test
    public void itShouldReturnFizzForDivisibleBy5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("Buzz", fizzBuzz.NumberToString(5));
        Assert.assertEquals("Buzz", fizzBuzz.NumberToString(95));
    }

    @Test
    public void itShouldReturnNumberOnNotDivisibleBy3Or5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("7", fizzBuzz.NumberToString(7));
        Assert.assertEquals("98", fizzBuzz.NumberToString(98));
    }

    @Test
    public void itShouldReturnFizzBuzzForDivisibleBy3and5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assert.assertEquals("FizzBuzz", fizzBuzz.NumberToString(15));
        Assert.assertEquals("FizzBuzz", fizzBuzz.NumberToString(75));
    }

    @Test
    public void itShouldHaveOnLongRunningTestToKeepCiBusy() throws InterruptedException {
        Thread.sleep(10000);
    }
}
