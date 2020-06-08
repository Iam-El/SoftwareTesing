package Homework3;

import static org.junit.Assert.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class Problem2ClassTestParameterized {
	private Problem2Class problem2;
	private boolean primeStatus;
	private double totalPremium;
	private double premium;
	private boolean policyHolder;
	private int yearsMember;
	private boolean multiPolicies;
	private int safetyRating;
	private double taxRate;

// executed before the @ test method. creates a object of the class
	@Before
	public void setUp() throws Exception {
		problem2 = new Problem2Class();
	}


	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
				// Parameters are: (1,2,3,4,5,7,8)
				// 1=premium, 2=policyHolder, 3=yearsMember, 4=multiPolicies, 5=safetyRating
				// ,6=taxRate,7=primeStatus ,8=totalPremium

				// Test case 1
				{ 5000.01, true, 5, true, 500, 0.0825, true, 4330.01 },
				// Test case 2
				{ 2000.00, true, 6, false, 500, 0.0825, true, 1840.25 },
				// Test case 3
				{ 1250.01, true, 6, false, 500, 0.0825, true, 1217.82 },
				// Test case 4
				{ 350.00, true, 6, false, 500, 0.0825, true, 359.93 },
				// Test case 5
				{ 349.99, true, 6, false, 500, 0.0825, true, 378.86},
				// Test case 6
				{ 349.99, false, 6, false, 501, 0.0825, true, 378.86 },
				// Test case 7
				{ 349.99, false, 5, true, 501, 0.0825, true, 378.86 },
				// Test case 8
				{ 349.99, false, 5, false, 501, 0.0825, false, 378.86 },
				// Test case 9
				{ 349.99, false, 5, true, 500, 0.0825, false, 378.86 },
				// Test case 10
				{ 1250.00, false, 6, false, 501, 0.0825, true, 1285.47 },
				// Test case 11
				{ 1999.99, false, 6, false, 501, 0.0825, true, 1948.49 },
				// Test case 12
				{ 5000.00, false, 6, false, 501, 0.0825, true, 4600.63 },
				// Test case 13
				{ 0.00, false, 6, false, 501, 0.0825, true, 0.00 },
				// Test case 14
				{ 10000.00, false, 6, false, 501, 0.0825, true, 8660.00 },
				// Test case 15
				{ 349.99, false, 5, true, 1, 0.0825, false, 378.86 },
				// Test case 16
				{ 349.99, false, 5, true, 999, 0.0825, true, 378.86 },
				// Test case 17
				{ 349.99, false, 0, true, 500, 0.0825, false, 378.86 },
				// Test case 18
				{ 349.99, false, 50, true, 500, 0.0825, true, 378.86 },

		});
	}
	
	// constructor of the class Problem2ClassTestParameterized

	public Problem2ClassTestParameterized(double premium,boolean policyHolder, 
		 int yearsMember, boolean multiPolicies, int safetyRating, double taxRate,boolean primeStatus,double totalPremium) {
		this.premium = premium;
		this.policyHolder = policyHolder;
		this.yearsMember = yearsMember;
		this.multiPolicies = multiPolicies;
		this.safetyRating = safetyRating;
		this.taxRate = taxRate;
		this.primeStatus=primeStatus;
		this.totalPremium=totalPremium;

	}
	
	// @ test method where actual test is being executed

	@Test
	public void test() {
		problem2.setPrimeStatus(primeStatus);
		problem2.setTotalPremium(totalPremium);
		problem2.determineInsPremium(premium, policyHolder, yearsMember, multiPolicies, safetyRating, taxRate);
		assertEquals(primeStatus, problem2.isPrimeStatus());
		assertEquals(totalPremium, problem2.getTotalPremium(), 0.01);

	}
}
