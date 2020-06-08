package Homework3;


import static org.junit.Assert.*;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTestFileParam {
	private Problem5Class problem5;

// @before method executed before @test . creates a object of class 
	@Before
	public void setUp() {
		problem5 = new Problem5Class();
	}

	//@ test mthod where actual test is being run . reads the data from the csv
	@Test
	@FileParameters("src/Homework3/Problem5TestCaseTable.csv")
	public void test(int testcaseNumber,double x,double y,String bpNumber) {
	double y1=problem5.calcY(x);
	assertEquals(y, y1,0.001);

}
}