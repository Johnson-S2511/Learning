class Mapla{
	private String name;
	private int age;
	private String ooru;
	
	public Mapla() {
		                  // Default Constructor
	}
	public Mapla(String name, int age, String ooru) {  /*Parameterized Constructor*/
		this.name = name;
		this.age = age;
		this.ooru = ooru;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getOoru() {
		return ooru;
	}
	public void setOoru(String ooru) {
		this.ooru = ooru;
	}
	
	
}


public class Constructors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mapla mdu=new Mapla();// default Constructor call we get default value
		System.out.println(mdu.getName() +" : "+mdu.getAge()+" : "+mdu.getOoru());
		
		Mapla pondy=new Mapla("Kevin",22,"Pondicherry"); // Parameterized Constructor
		pondy.setAge(23);
		System.out.println(pondy.getName() +" : "+pondy.getAge()+" : "+pondy.getOoru());
		

	}

}
