package MuniPranay.EpamTask4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Building_cost_EstimationTest {

	Building_cost_Estimation object1=new Building_cost_Estimation();
	@Test
	public void testBuildCost1() 
	{
		assertEquals(24000,object1.buildCost("standard house", 20));
	}

	@Test
	public void testBuildCost2() 
	{
		assertEquals(45000,object1.buildCost("above standard house", 30));
	}
	@Test
	public void testBuildCost3() 
	{
		assertEquals(72000,object1.buildCost("high standard house", 40));
	}
	@Test
	public void testBuildCost4() 
	{
		assertEquals(125000,object1.buildCost("high standard and fully automated house", 50));
	}
}
