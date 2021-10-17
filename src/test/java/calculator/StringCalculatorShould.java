package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorShould {
    
    private StringCalculator calc;
    @Test
    void empty_string_should_return_0() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(0, stringCalculator.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        StringCalculator stringCalculator = new StringCalculator();
        assertEquals(1, stringCalculator.add("1"));
    }
    
     @Test
    public void numberStringShouldReturnSameNumber() {
        assertEquals(calc.add("2"), 2);
    }

    @Test
    public void numbersCommaDelimitedShouldBeSummed() {
        assertEquals(calc.add("1,2"), 3);
        assertEquals(25, calc.add("10,15"));
    }

    @Test
    public void numbersNewlineDelimitedShouldBeSummed() {
        assertEquals(calc.add("1\n2"), 3);
        assertEquals(calc.add("11\n13"), 24);
    }

    @Test
    public void threeNumbersDelimitedAnywayShouldBeSummed() {
        assertEquals(calc.add("1,2,3"), 6);
        assertEquals(calc.add("5\n2\n3"), 10);
    }
}
