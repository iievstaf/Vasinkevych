

public class Patient extends Person{
	private String sex; // how do  make chose(?) - arraylist 2 element or enum
	private int yearOfBirth;
	
	
	public Patient (String alogin, String apass, int aid, String alastName, String afirstName, String aSex, int aYearOfBirth ) {
		super (alogin,  apass, aid, alastName, afirstName );
	sex = aSex;
	yearOfBirth = aYearOfBirth;
	}

	public String getSex () {
	return sex;
	}
	public void setSex(String sex){
	this.sex = sex;
	}
	public int getYearOfBirth () {
	return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth){
	this.yearOfBirth = yearOfBirth;
		}

}

