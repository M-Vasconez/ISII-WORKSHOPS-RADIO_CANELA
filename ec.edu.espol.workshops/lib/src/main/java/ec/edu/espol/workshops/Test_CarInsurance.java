package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;


class Test_CarInsurance {

	@Test
	void test1CalculateInsurance() {
		int expectedPremium = -1;
		int carins1 = ec.edu.espol.workshops.CarInsurance.validateBoundary(17, "", "2012/11/17");
		assertEquals(expectedPremium,carins1);
	}

	@Test
	void test2CalculateInsurance() {
		int expectedPremium = -1;
		int carins2 = ec.edu.espol.workshops.CarInsurance.validateBoundary(81, "ma", "2032/11/19");
		assertEquals(expectedPremium,carins2);
	}

	@Test
	void test3CalculateInsurance() {
		int expectedPremium = 0;
		int carins3 = ec.edu.espol.workshops.CarInsurance.validateInputs("18", "m", "notmarried", "2012/11/18");
		assertEquals(expectedPremium,carins3);
	}

	@Test
	void test4CalculateInsurance() {
		int expectedPremium = 0;
		int carins4 = ec.edu.espol.workshops.CarInsurance.validateInputs("80", "f", "married", "2032/11/18");
		assertEquals(expectedPremium,carins4);
	}
	
	@Test
	void test5CalculateInsurance() {
		int expectedPremium = -1;
		int carins5 = ec.edu.espol.workshops.CarInsurance.validateInputs("test", "f", "12", "12");
		assertEquals(expectedPremium,carins5);
	}

}
