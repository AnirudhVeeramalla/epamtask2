/**
 * 
 */
package epamtask2.simpleandcompoundinterest;

/**
 * Simple application to find simple and compound interest
 * @author LENOVO
 */

public class SimpleAndCompundInterest {
	
	/**
	 * method to calculate simple interest
	 * @param principle
	 * @param time
	 * @param rate
	 * @return simple interest for "time" years
	 */
	
	public double simpleInterest(double principle,double time,double rate)
	{
		return (principle*time*rate)/100;
	}
    
	/**
	 * method to calculate compound interest
	 * @param principle
	 * @param rate
	 * @param time
	 * @param nooftimes
	 * @return compound interest for "time" years
	 */
	public double compoundInterest(double principle,double rate,double time,int nooftimes)
	{
		return principle*Math.pow((1+(rate/nooftimes)),nooftimes*time);
	}
}
