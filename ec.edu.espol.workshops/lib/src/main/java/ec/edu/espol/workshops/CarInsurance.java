package ec.edu.espol.workshops;

import java.util.GregorianCalendar;

public class CarInsurance { 

	private final Integer base = 500;//A
	private final Integer maleNotMarried25 = 1500;//A
	private final Integer femMarried = 200;//A
	private final Integer between45and65 = 100;//A
	
	private Integer age;//A
	private String sex;//A
	private String maritalStatus;//A
	private String drivingLicense;//A
	
	public CarInsurance(Integer age, String sex, String maritalStatus, String drivingLicense) { //B
		super();//B
		this.age = age;//B
		this.sex = sex;//B
		this.maritalStatus = maritalStatus;//B
		this.drivingLicense = drivingLicense;//B
	}

	public Integer getAge() {return age;} //C

	public void setAge(Integer age) {this.age = age;} //C

	public String getSex() {return sex;}  //C
	
	public void setSex(String sex) {this.sex = sex;} //C

	public String getDrivingLicense() {return drivingLicense;} //C

	public void setDrivingLicense(String drivingLicense) {this.drivingLicense = drivingLicense;} //C
	
	public String getMaritalStatus() {return maritalStatus;} //C

	public void setMaritalStatus(String maritalStatus) {this.maritalStatus = maritalStatus;} //C
	
	
	public Integer calculateInsurance() { 
		if (checkPolicies()) { //D
			if (sex.equalsIgnoreCase("m")/*E*/ && maritalStatus.equalsIgnoreCase("notmarried")/*F*/  && age < 25/*G*/ ) 
			return base + maleNotMarried25; //H
			if (sex.equalsIgnoreCase("f")/*I*/ || maritalStatus.equalsIgnoreCase("married")/*J*/)  
				return base - femMarried; //K
			if (age > 45 && age < 65)  //L
				return base - between45and65; //L
		} //M
		return -1; //M
	} //M
	
	public boolean checkPolicies() { //N
		String[] fecha = drivingLicense.split("/"); //N
		GregorianCalendar currentDate = new GregorianCalendar(); //N
		GregorianCalendar date = new GregorianCalendar(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]) ); //N
		if(age > 80 ) //O
			return false; //O
		else if (currentDate.after(date)) //P
			return false; //P
		else //Q
			return true; //Q
		
	} //Q
	
	
}
