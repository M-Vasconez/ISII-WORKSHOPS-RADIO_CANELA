package ec.edu.espol.workshops;

import java.util.GregorianCalendar;
import java.util.regex.Pattern;

public class CarInsurance {

	private final Integer base = 500;
	private final Integer maleNotMarried25 = 1500;
	private final Integer femMarried = 200;
	private final Integer between45and65 = 100;
	
	private Integer age;
	private String sex;
	private String maritalStatus;
	private String drivingLicense;
	
	public CarInsurance(Integer age, String sex, String maritalStatus, String drivingLicense) {
		super();
		this.age = age;
		this.sex = sex;
		this.maritalStatus = maritalStatus;
		this.drivingLicense = drivingLicense;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getDrivingLicense() {
		return drivingLicense;
	}

	public void setDrivingLicense(String drivingLicense) {
		this.drivingLicense = drivingLicense;
	}
	
	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
	public Integer calculateInsurance() {
		if (sex.equalsIgnoreCase("m") && maritalStatus.equalsIgnoreCase("notmarried") && age < 25)
			return base + maleNotMarried25;
		else if (sex.equalsIgnoreCase("f") || maritalStatus.equalsIgnoreCase("married")) 
			return base - femMarried;
		else if (age > 45 && age < 65) 
			return base - between45and65;
		else if (checkPolicies())
			return base;
		else
			return -1;	
	}
	
	private boolean checkPolicies() {
		String[] fecha = drivingLicense.split("/");
		GregorianCalendar currentDate = new GregorianCalendar();
		GregorianCalendar date = new GregorianCalendar(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]) );
		if(age > 80 )
			return false;
		else if (currentDate.after(date))
			return false;
		else
			return true;
		
	}
	
	public static int validateInputs(Object age, Object sex, Object maritalStatus, Object drivingLicense) {
		Pattern numericValue = Pattern.compile("\\d+");
		String edad=(String) age;
		if(!numericValue.matcher(edad).matches())
			return -1;
	
		Pattern sexValue = Pattern.compile("[mf]?");
		String sexo=(String) sex;
		if (!sexValue.matcher(sexo).matches())
			return -1;
		
		Pattern marriedValue = Pattern.compile("\\bmarried\\b",Pattern.CASE_INSENSITIVE);
		Pattern notMarriedValue = Pattern.compile("\\bnotmarried\\b",Pattern.CASE_INSENSITIVE);
		String married=(String) maritalStatus;
		if (!marriedValue.matcher(married).matches() && !notMarriedValue.matcher(married).matches())
			return -1;
		
		//FECHA FORMATO AAAA/MM/DD
		Pattern dateValue = Pattern.compile("^[0-9]{4}/(1[0-2]|0[1-9])/(3[01]|[12][0-9]|0[1-9])$");
		String fecha=(String) drivingLicense;
		if (!dateValue.matcher(fecha).matches())
			return -1;
		
		return 0;
	}
	public static int validateBoundary(Integer age, String sex, String drivingLicense) {
		if(age < 18 || age > 80)
			return -1;
	
		if (sex.length() != 1)
			return -1;
		
		String[] fecha = drivingLicense.split("/");
		GregorianCalendar beforeDate = new GregorianCalendar(2012, 11, 18);
		GregorianCalendar aftereDate = new GregorianCalendar(2032, 11, 18);
		GregorianCalendar date = new GregorianCalendar(Integer.parseInt(fecha[0]), Integer.parseInt(fecha[1]), Integer.parseInt(fecha[2]) );
		if (date.after(aftereDate) || date.before(beforeDate))
			return -1;
		return 0;
	}
	
	
}
