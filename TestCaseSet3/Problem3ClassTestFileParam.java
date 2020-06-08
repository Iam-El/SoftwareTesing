package Homework3;


import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTestFileParam {
	private Problem3Class problem3;
	
//executed before @test . creates a object of a class
	@Before
	public void setUp() {
		problem3 = new Problem3Class();
	}

	// @test is the actual test method being exexuted. it reads the variables from the csv file
	@Test
	@FileParameters("src/Homework3/Problem3TestCaseTable.csv")
	public void test(int testcaseNumber, double distance, boolean cruiseRequested, double speed, boolean redLight,
		boolean yellowLight, boolean greenLight, boolean caution, boolean warning, boolean cruiseEngaged,String bpNumber,String value) {
		problem3.setRedLight(redLight);
		problem3.setYellowLight(yellowLight);
		problem3.setGreenLight(greenLight);
		problem3.setCaution(caution);
		problem3.setWarning(warning);
		problem3.setCruiseEngaged(cruiseEngaged);
		problem3.setWarnings(cruiseRequested, distance, speed);

		assertEquals(redLight, problem3.isRedLight());
		assertEquals(yellowLight, problem3.isYellowLight());
		assertEquals(greenLight, problem3.isGreenLight());
		assertEquals(caution, problem3.isCaution());
		assertEquals(warning, problem3.isWarning());
		assertEquals(cruiseEngaged, problem3.isCruiseEngaged());

	}

}
