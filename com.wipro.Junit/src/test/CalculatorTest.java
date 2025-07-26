package test;
import org.junit.Test;
import static org.junit.Assert.*;
public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(5,c.add(2, 3));
	}

	@Test
	public void testSub() {
		Calculator c = new Calculator();
		assertEquals(20,c.add(200, 180));
	}

}
