package MuniPranay.EpamTask4;

import static org.junit.Assert.*;

import org.junit.Test;

public class Calculate_interestTest {

	
	@Test
	public void testSimple_interest_calculation()
	{
		Calculate_interest object1=new Calculate_interest();
		assertEquals(120,object1.Simple_interest_calculation(1000, 6, 2));
	}


	@Test
	public void testCompound_interest_calculation()
	{
		Calculate_interest object2=new Calculate_interest();
		assertEquals(3637,object2.compound_interest_calculation(2000,5,8,12));
	}


}
