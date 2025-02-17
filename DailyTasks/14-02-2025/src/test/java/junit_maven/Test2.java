package junit_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test2 {

	@Test
	void test() {
Exception2 ex=new Exception2();
        
        
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            ex.divide(10, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    
	}

}
