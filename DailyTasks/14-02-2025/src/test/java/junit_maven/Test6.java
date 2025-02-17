package junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class Test6 {

    private Calculator calculator = new Calculator();

    @Test
    void testAddValid() {
        // This test will run
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    @Disabled("This test is temporarily disabled due to known issue")
    void testAddWithNegativeNumbers() {
        // This test will be skipped
        int result = calculator.add(-2, -3);
        assertEquals(-5, result, "Adding two negative numbers should return the correct result");
    }
}
