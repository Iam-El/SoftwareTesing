package Homework5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {
  
	private Problem5Class problem5;
	@Before
	public void setUp() throws Exception {
		problem5 = new Problem5Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem5TestCaseTable.csv")	
	public void test(int testcaseNumber, double cart, boolean coupon, int memberPoints, int items, boolean member, double taxRate,double result,  String bp,String MCDC) {		
		double result1=problem5.determineTotal(cart,  member,  items,  coupon,  memberPoints,  taxRate);
		assertEquals(result, result1,0.006);
	}

}

