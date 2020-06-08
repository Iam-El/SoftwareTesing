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
public class Problem2ClassTest {
  
	private Problem2Class problem2;
	@Before
	public void setUp() throws Exception {
		problem2 = new Problem2Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem2_Answers.csv")	
	public void test(int testcaseNumber, double distance, double speed, boolean cruiseEngaged,boolean applyBrakes,double brakingFactor,String bp,String MCDC) {		
		problem2.setBrakingFactor(brakingFactor);
		problem2.setApplyBrakes(applyBrakes);
		problem2.autoBraking(distance,speed,cruiseEngaged);
		assertEquals(brakingFactor,problem2.getBrakingFactor(),0.001);
		assertEquals(applyBrakes,problem2.isApplyBrakes());
	}

}

