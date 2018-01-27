import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
//a
public class balanceSymbTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBalancer() {
		//Test cases
		//Checks if the returns are for each case is similar with our test
		String alpha = balanceSymb.balancer("[()]");
		assertEquals("Symbols Are Balanced", alpha);
		
		String beta = balanceSymb.balancer("abg");
		assertEquals("Only Symbols are allowed", beta);
		
		String beta1 = balanceSymb.balancer("123");
		assertEquals("Only Symbols are allowed", beta1);
		
		String beta2 = balanceSymb.balancer("**");
		assertEquals("Only Symbols are allowed", beta2);
		
		String delta3 = balanceSymb.balancer(" ");
		assertEquals("Only Symbols are allowed", delta3);
		
		String delta = balanceSymb.balancer("");
		assertEquals("Input is empty", delta);
		
		String epsilon = balanceSymb.balancer("{{)");
		assertEquals("Symbols are not Balanced", epsilon);
	}

}
