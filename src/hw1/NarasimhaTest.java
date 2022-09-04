package hw1;

public class NarasimhaTest 
{
	public static void main(String [] args)
	{
		Student mano = new Student("Mano", "CS @ SJSU", 3515);
		System.out.println(mano.getName());
		System.out.println("EXPECTED: Mano");
		
		System.out.println(mano.getIntroduction());
		System.out.println("EXPECTED: CS @ SJSU");
		
		System.out.println(mano.getStudentId());
		System.out.println("EXPECTED: 3515");
	}
}
