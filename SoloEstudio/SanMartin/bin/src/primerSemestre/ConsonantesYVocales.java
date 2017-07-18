package primerSemestre;

class ConsonantesYVocales
{
	public static void main(String[] args)
	{
		char c = (char) (Math.random()*26 + 'a');
		System.out.println("c + :");
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			System.out.println("Es Vocal");
		else if (c=='y' || c=='w')
			System.out.println("Algunas veces vocal");
		else
			System.out.println("Es Consonnte");
	}

}
