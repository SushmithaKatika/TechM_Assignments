package junit_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test7 {
	private errorMsg erMsg=new errorMsg();
	@Test
	void testAdd() {
		int result = erMsg.add(5, 3);
        assertEquals(8, result, "Addition failed: Expected 8, but got " + result);
	}
	void testSubtract() {
        int result = erMsg.subtract(5, 3);
        assertEquals(2, result, "Subtraction failed: Expected 2, but got " + result);
    }
	void testMultiply() {
        int result = erMsg.multiply(5, 3);
        assertEquals(15, result, "Multiplication failed: Expected 15, but got " + result);
    }
	void testDivide() {
        int result = erMsg.divide(6, 2);
        assertEquals(3, result, "Division failed: Expected 3, but got " + result);
    }
	void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            erMsg.divide(6, 0);
        });
        assertEquals("Division by zero is not allowed!", exception.getMessage(), "Exception message doesn't match.");
    }

}
