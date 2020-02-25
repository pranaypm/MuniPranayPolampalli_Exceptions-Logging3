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
public class Building_cost_Estimation
{
	private static final Logger logger2 = LogManager.getLogger(Building_cost_Estimation.class);
	public int buildCost(String type_of_material,int area_of_house)
	{
		logger2.info("Type of material : "+type_of_material+"\n Area of House : "+area_of_house);
	int price=1;
	if(type_of_material.equalsIgnoreCase("standard house"))
	{
		price=1200;
	}
	else if(type_of_material.equalsIgnoreCase("above standard house")) 
	{
		price=1500;
	}
	else if(type_of_material.equalsIgnoreCase("high standard house")) 
	{
		price=1800;
	} 
	else if(type_of_material.equalsIgnoreCase("high standard and fully automated house"))
	{
		price=2500;
	}
	else
	{
		logger2.warn("Material is no in option , Please choose Again ");
	return 0;
	}
	return price*area_of_house;
    }
}
