package ec.edu.espol.workshops;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatementCoverageTest {


	@Test
	void test1CalculateInsurance() {
		int expectedPremium = 200;
		CarInsurance carins1 = new CarInsurance(50, "f", "married", "2026/10/19");
		assertEquals(expectedPremium,carins1.calculateInsurance());
	}
	
	@Test
	void test2CalculateInsurance() {
		int expectedPremium = 500;
		CarInsurance carins2 = new CarInsurance(28, "m", "notmarried", "2023/07/09");
		assertEquals(expectedPremium,carins2.calculateInsurance());
	}
	
	@Test
	void test3CalculateInsurance() {
		int expectedPremium = -1;
		CarInsurance carins3 = new CarInsurance(82, "m", "married", "2025/07/04");
		assertEquals(expectedPremium,carins3.calculateInsurance());
	}
	
	@Test
	void test4CalculateInsurance() {
		int expectedPremium = -1;
		CarInsurance carins4 = new CarInsurance(25, "f", "notmarried", "2017/01/04");
		assertEquals(expectedPremium,carins4.calculateInsurance());
	}

}
