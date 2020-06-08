package Homework3;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTestJUnitParams {
	private Problem1Class problem1 ;

	@SuppressWarnings("unused")
	private static final Object[] parametersForProblem1ClassTest() {
		return $(
				// Parameters are: (1,2,3,4,5,6)
				// 1=batteryPower(watts), 2=red, 3=yellow, 4=green, 5=bell,6=siren
				// Test case 1
				$(0.0, false, false, false, false, true),
				// Test case 2
				$(49.9, false, false, false, true, false),
				// Test case 3
				$(75.0, true, false, false, false, false),
				// Test case 4
				$(124.9, true, true, false, false, false),
				// Test case 5
				$(250.0, false, true, false, false, false),
				// Test case 6
				$(250.1, false, false, true, false, false),
				// Test case 7
				$(0.1, false, false, false, true, false),
				// Test case 8
				$(50.0, true, false, false, false, false),
				// Test case 9
				$(75.1, true, true, false, false, false),
				// Test case 10
				$(125.0, false, true, false, false, false),
				// Test case 11
				$(1000.0, false, false, true, false, false));
	}

	//excecuted before the test method .creates a object of the class
	@Before
	public void setUp() {
		problem1 = new Problem1Class();
	}

	//actual test method to be run
	@Test
	@Parameters(method = "parametersForProblem1ClassTest")
	public void test(double batteryPower, boolean red, boolean yellow, boolean green, boolean bell, boolean siren) {

		problem1.setRedLight(red);
		problem1.setYellowLight(yellow);
		problem1.setGreenLight(green);
		problem1.setBell(bell);
		problem1.setSiren(siren);
		problem1.calcLights(batteryPower);
		assertEquals(red,problem1.isRedLight());
		assertEquals(yellow,problem1.isYellowLight());
		assertEquals(green,problem1.isGreenLight());
		assertEquals(bell,problem1.isBell());
		assertEquals(siren,problem1.isSiren());
	}

}