package ec.edu.espol.workshops;

import io.cucumber.javajava.en.Given;
import io.cucumber.javajava.en.Then;
import static org.junit.Assert.*;
public class StepsDefs {
	
	@then("we should receive =1")
	public void we_calculated_premium() {
		int expectedPremium = 300;
		CarInsurance carins1 = new CarInsurance(50, "f", "married", "2026/10/19");
		assertEquals(expectedPremium,carins1.calculateInsurance());
	}
	
	@then("we should receive =1")
	public void we_calculated_premium() {
		int expectedPremium = 500;
		CarInsurance carins2 = new CarInsurance(28, "m", "notmarried", "2023/07/09");
		assertEquals(expectedPremium,carins2.calculateInsurance());
	}
}
