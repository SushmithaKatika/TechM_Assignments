package junit_maven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test5 {
	private Timeout4 to4 = new Timeout4();

	@Test
	//@Timeout(value = 100, unit = TimeUnit.MILLISECONDS) 
	void test() throws InterruptedException {
		to4.performLongTask();
	}

}
