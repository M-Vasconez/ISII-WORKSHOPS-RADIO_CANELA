package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;


class Test_CarInsurance {

	@Test
	void test1CalculateInsurance() {
		int expectedPremium = -1;
		int carins1 = ec.edu.espol.workshops.CarInsurance.validateInputs("10", "10", "10", "10");
		assertEquals(expectedPremium,carins1);
	}
	
	@Test
	void test2CalculateInsurance() {
		int expectedPremium = -1;
		int carins2 = ec.edu.espol.workshops.CarInsurance.validateInputs("90", "test", "test", "2022-10-05");
		assertEquals(expectedPremium,carins2);
	}
	
	@Test
	void test3CalculateInsurance() {
		int expectedPremium = 0;
		int carins3 = ec.edu.espol.workshops.CarInsurance.validateInputs("28", "m", "notmarried", "2026/10/05");
		assertEquals(expectedPremium,carins3);
	}
	
	@Test
	void test4CalculateInsurance() {
		int expectedPremium = -1;
		int carins4 = ec.edu.espol.workshops.CarInsurance.validateInputs("veintiocho", "f", "married", "2026/10/05");
		assertEquals(expectedPremium,carins4);
	}
	
	

}
