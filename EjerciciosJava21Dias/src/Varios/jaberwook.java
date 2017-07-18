package Varios;

class jaberwook {
	private String color;
	String sexo;
	boolean hungry;

	void feedjaberwook() {
		if (hungry == true) {
			System.out.println("yum....a peasent");
			hungry = false;
		} else {
			System.out.println("No tanks ..... already ate");
		}
	}

	void showattributes() {
		System.out.println("this is a " + sexo + "  " + getColor() + " jaberwook");
		if (hungry == true)
			System.out.println("the jaberwook is hungry");
		else	
			System.out.println("the jaberwook is full");
	}

	public static void main(String[] args) 
	{
		jaberwook j = new jaberwook ();
		j.setColor("orange");
		j.sexo="masculino";
		j.hungry=true;
		System.out.println("calling showatributes");
		j.showattributes();
		System.out.println("....");
		System.out.println("feeding the jaberwook");
		j.feedjaberwook();
		System.out.println("....");
		System.out.println("Calling show atributes");
		j.showattributes();
		System.out.println("....");
		System.out.println("feeding the jaberwook");
		j.feedjaberwook();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}