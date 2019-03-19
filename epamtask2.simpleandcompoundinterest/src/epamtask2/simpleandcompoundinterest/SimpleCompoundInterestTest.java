package epamtask2.simpleandcompoundinterest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


/**
 * This is class to test simple and compound interest
 * @author AnirudhVeeramalla
 *
 */
public class SimpleCompoundInterestTest {

	@Test
	public void simpleInterestTest()
	{
		SimpleAndCompundInterest sc=new SimpleAndCompundInterest();
		assertEquals(500,sc.simpleInterest(1000, 10, 5),0.1);
		assertEquals(420,sc.simpleInterest(1000, 6, 7),0.1);
	}
	
	@Test
	public void compoundInterest()
	{
		SimpleAndCompundInterest sc=new SimpleAndCompundInterest();
		assertEquals(5984.74,sc.compoundInterest(5000, 0.03, 6,12),0.1);
	}
}
