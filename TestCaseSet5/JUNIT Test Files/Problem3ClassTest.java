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

public class Problem3ClassTest {
	
	private Problem3Class problem3;

	@Before
	public void setUp() throws Exception {
		problem3 = new Problem3Class();
	}

	@Test
	@FileParameters("src/Homework5/Problem3_Answers.csv")
	public void test(int testcaseNumber,int month, int day, int year,int result,String mcdc) {
		int result1=problem3.calcPrevDayNum(month,day,year);
		assertEquals(result, result1);
	}

}
