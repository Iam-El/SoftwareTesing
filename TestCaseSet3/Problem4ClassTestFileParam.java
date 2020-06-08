package Homework3;


import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTestFileParam {
	private Problem4Class problem4;

	// mehod executed before @test . creates an object of the class
	@Before
	public void setUp() {
		problem4 = new Problem4Class();
	}

	// test method where actual test is being run . it reads the variables from the csv file
	@Test
	@FileParameters("src/Homework3/Problem4TestCaseTable.csv")
	public void test(int testcaseNumber,boolean landing, double speed, double altitude,Problem4Class.landing action,String bpNumber,String value) {
		problem4.setAction(action);
		problem4.landCraft(landing, altitude, speed);
		assertEquals(action, problem4.getAction());

	}

}