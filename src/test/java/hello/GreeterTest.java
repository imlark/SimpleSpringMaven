package hello;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

	@Test
	public void sumTest() {
	     int a = 1;
	        int b = 2;
	        int expected = 3;
	        int result = hello.Greeter.sum(a, b);
	         
	        assertEquals(expected , result);
	}

}
