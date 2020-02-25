/**
 * 
 */
package MuniPranay.EpamTask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author polampalli
 *
 */
public class Main_class {
 
	private static final Logger logger1 = LogManager.getLogger(Main_class.class);
	
	public static void main(String[] args) 
	{
	logger1.info("Creating the Object for Building Estimation");
	Building_cost_Estimation object1=new Building_cost_Estimation();
	int price= object1.buildCost("standard house", 20);
    System.out.println("The cost price for house is :"+price);
    logger1.info("The cost price for house is :"+price); 
    int To_check_logger_getting_price= object1.buildCost("house", 20);
     System.out.println("The cost price for house is :"+To_check_logger_getting_price);
     if(To_check_logger_getting_price==0)
     {
    	 logger1.error("The value of Area is invalid");	 
     }
     
     logger1.info("Creating the Object for Interest");
     Calculate_interest object2=new Calculate_interest();
     
     logger1.info("Accessing the Simple Interest Method 1st time");
     int simple_interest_calculation=object2.Simple_interest_calculation(1000, 6, 2);
     System.out.println("The value of interest is :"+simple_interest_calculation);
     logger1.info("The value of interest is :"+simple_interest_calculation);
     
     logger1.info("Accessing the Simple Interest Method 2nd time");
     int simple_interest_calculation_checking=object2.Simple_interest_calculation(1000, -6, 2);
     System.out.println("The value of interest is :"+simple_interest_calculation);
     logger1.info("The value of interest is :"+simple_interest_calculation_checking);
     
     logger1.info("Accessing the Compound Interest Method 1st time");
     int compound_interest_calculation=object2.compound_interest_calculation(2000, 5, 8,12);
     System.out.println("The value of interest is :"+compound_interest_calculation);
     logger1.info("The value of interest is :"+compound_interest_calculation);
     
     logger1.info("Accessing the Compound Interest Method 2nd  time");
     int compound_interest_calculation_checking=object2.compound_interest_calculation(2000, -5, 8,12);
     System.out.println("The value of interest is :"+compound_interest_calculation);
     logger1.info("The value of interest is :"+compound_interest_calculation_checking);
	}

}
