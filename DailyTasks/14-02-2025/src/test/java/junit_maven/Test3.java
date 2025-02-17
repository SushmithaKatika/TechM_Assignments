package junit_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test3 {
    
    private Calculator calculator;
    
    @BeforeEach
    void setUp() throws Exception {
        calculator = new Calculator();
        System.out.println("Setup: New Calculator instance created.");
    }

    @AfterEach
    void tearDown() throws Exception {
        System.out.println("Teardown: Cleaning up resources.");
    }

    @Test
    void test() {
        int result = calculator.add(5, 3);
        assertEquals(8, result, "5 + 3 should equal 8");
    }
}
