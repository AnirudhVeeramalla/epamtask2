package epamtask2.housecostestimation;

/**
 * Application to estimate cost of house
 * @author AnirudhVeeramalla
 */
public class CostEstimation {

	/**
	 * method to get estimated cost of house
	 * @param materialStandard
	 * @param areaOfHouse
	 * @param isAutomated
	 * @return cost of house based on material,area
	 */
	public double getCost(String materialStandard,double areaOfHouse,boolean isAutomated)
	{
		double cost=0;
		if(materialStandard.equals("standard"))
		{
			cost=areaOfHouse*1200;
		}
		else if(materialStandard.equals("aboveStandard"))
		{
			  cost=areaOfHouse*1500;
		}
		else if(materialStandard.equals("highStandard"))
		{
			if(isAutomated)
				cost=areaOfHouse*2500;
			else
				cost=areaOfHouse*1800;
		}
		return cost;
	}
}
