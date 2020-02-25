package MuniPranay.EpamTask4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculate_interest
     {
	private static final Logger logger3 = LogManager.getLogger(Calculate_interest.class);
	
	public int Simple_interest_calculation(double principle_amount,float rate_of_interest,int time_period)
	{
		if(principle_amount>0 && rate_of_interest >=0 && time_period >0)
		{
			logger3.info("Principle amount : "+principle_amount+"\n"+"Rate of Interest : "+rate_of_interest+"\n"+"Time period : ",time_period);
		double Simple_Interest=(principle_amount*time_period*rate_of_interest)/100;
		
		
		logger3.info("Total amount :"+(int)Simple_Interest);
		return (int)Simple_Interest;
		}
		else
		{
			logger3.error("The values sent to function are 0 or less in Simple interest Calculation ");
			return 0;
		}
	}
	
	
	
	
	public int compound_interest_calculation(int principle_amount,double rate_of_interest,int no_of_years,int time_period)
	{
		if(principle_amount>0 && rate_of_interest >=0 && no_of_years>0 && time_period >0)
		{
			logger3.info("Principle amount : "+principle_amount+"\n"+"Rate of Interest : "+rate_of_interest+"\n"+"No of Years : "+no_of_years+"\n"+"Time period : ",time_period);	
		rate_of_interest=rate_of_interest/100;
		double Compound_interest=principle_amount*Math.pow((1+ rate_of_interest/no_of_years),no_of_years*time_period);
		logger3.info("Total amount :"+(int)Compound_interest);
		return (int)Compound_interest;
	    }
		else
		{
			logger3.error("The values sent to function are 0 or less in compound Interest Calculation ");
			return 0;
		}
}
	
     
     }
