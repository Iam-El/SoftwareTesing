package Homework5;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.*;

import org.easymock.EasyMock;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;




@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {
	
	private Problem4Class problem4;
	double batteryPower;
	Problem4ServerData mockObj; //declare mockobject


	@Before
	public void setUp() throws Exception {
		problem4 = new Problem4Class();
		mockObj=EasyMock.strictMock(Problem4ServerData.class); //construct mockobj
	}

	@Test
	@FileParameters("src/Homework5/Problem4TestCaseTable.csv")	
	public void test(int testcaseNumber,double batteryPower,boolean redLight,boolean yellowLight,boolean greenLight,boolean bell,boolean siren,String Bp) {
		EasyMock.expect(mockObj.getBatteryPower()).andReturn(batteryPower); // intercept the call
		EasyMock.replay(mockObj); // replay(activate) the mock
		problem4.setRedLight(redLight);
		problem4.setYellowLight(yellowLight);
		problem4.setGreenLight(greenLight);
		problem4.setBell(bell);
		problem4.setSiren(siren);
		problem4.calcLights(mockObj);
		assertEquals(redLight, problem4.isRedLight());
		assertEquals(yellowLight, problem4.isYellowLight());
		assertEquals(greenLight, problem4.isGreenLight());
		assertEquals(bell, problem4.isBell());
		assertEquals(siren, problem4.isSiren());
		
	}

}
