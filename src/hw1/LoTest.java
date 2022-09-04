package hw1;
import java.util.concurrent.ThreadLocalRandom;

public class LoTest {
	public static void main(String[] args) {
		Student kyle = new Student("Kyle", "Hi my name is Kyle", 016045523);
		Student randomStudent = new Student();
		System.out.println(kyle.getIntroduction());
		
		randomStudent.setIntroduction("Hi my name is Selena");
		randomStudent.setName("Selena");
		// https://stackoverflow.com/questions/51322750/generate-6-digit-random-number#:~:text=at%2015%3A25-,rnd.,)%3B%20into%20fixed%206%20digit.
		int studentID = ThreadLocalRandom.current().nextInt(000000, 1000000);
		randomStudent.setStudentId(studentID);
		System.out.println(randomStudent.getIntroduction());
		System.out.println("Selena's Student ID is: " +randomStudent.getStudentId());
	}
}
