package junit_maven;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class Test4 {

    private Calculator calculator = new Calculator();

    // Parameterized Test
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5}) // Provide different values for 'a'
    void test(int value) {
        int result = calculator.add(value, 2);  // Testing add() method with different values for 'a' and a fixed 'b' value (2)
        int expected = value + 2; // Expected result (a + 2)
        assertEquals(expected, result, "Expected sum for " + value + " + 2 is " + expected);
    }
}
