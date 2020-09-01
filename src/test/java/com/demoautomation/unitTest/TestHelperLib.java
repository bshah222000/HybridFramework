package com.demoautomation.unitTest;

import org.testng.annotations.Test;

import com.demoautomation.utility.Helper;

public class TestHelperLib {
	
	
	@Test
	public void testDates()
	{
		System.out.println(Helper.getCurrentDateTime());
	}

}
