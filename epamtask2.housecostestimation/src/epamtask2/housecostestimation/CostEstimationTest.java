/**
 * 
 */
package epamtask2.housecostestimation;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * This class is to test estimation of cost of house
 * @author AnirudhVeeramalla
 *
 */
public class CostEstimationTest {

	@Test
	public void estimateTest()
	{
		CostEstimation c=new CostEstimation();
		assertEquals(1200000,c.getCost("standard", 1000, false),0.1);
		assertEquals(1500000,c.getCost("aboveStandard", 1000, false),0.1);
		assertEquals(1800000,c.getCost("highStandard", 1000, false),0.1);
		assertEquals(2500000,c.getCost("highStandard", 1000, true),0.1);
	}
}
