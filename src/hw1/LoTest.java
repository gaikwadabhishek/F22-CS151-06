package hw1;
//import java.util.concurrent.ThreadLocalRandom;

public class LoTest {
	public static void main(String[] args) {
		Student kyle = new Student("Kyle Lo", "If a fly can't fly anymore does it become a walk?", 5523);
//		Student randomStudent = new Student();
		
		System.out.println("Student Name: "+kyle.getName());
		System.out.println("Student ID: " +kyle.getStudentId());
		System.out.println(kyle.getIntroduction());

		
//		randomStudent.setIntroduction("Hi my name is Selena");
//		randomStudent.setName("Selena");
//		// https://stackoverflow.com/questions/51322750/generate-6-digit-random-number#:~:text=at%2015%3A25-,rnd.,)%3B%20into%20fixed%206%20digit.
//		int studentID = ThreadLocalRandom.current().nextInt(0000, 10000);
//		randomStudent.setStudentId(studentID);
//		System.out.println(randomStudent.getIntroduction());
//		System.out.println("Selena's Student ID is: " +randomStudent.getStudentId());
	}
}
