
public class Doctor extends Person{
	private String specialisation;
	
	public Doctor(String alogin, String apass, int id, String alastName,
			String afirstName,String specialisation) {
		super(alogin, apass, id, alastName, afirstName);
		this.specialisation = specialisation;
		
		// TODO Auto-generated constructor stub
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation (){
		this.specialisation = specialisation;
	}
}
