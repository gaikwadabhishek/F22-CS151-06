package hw1;

public class UdupaTest {
	
	public static void main(String[] args) {
		Student s = new Student("Sharanya Udupa", "Hello! I am a 2nd year studying SWE and I love loaded nachos!", 0745);
		
		//my tests
		System.out.println(s.getName());
		System.out.println();
		System.out.println(s.getIntroduction());
		System.out.println();
		System.out.println(s.getStudentId()); //not printing correct student id bc it starts with 0
		
	}

}
