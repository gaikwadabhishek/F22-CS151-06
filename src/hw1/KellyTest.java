package hw1;

public class KellyTest {
    public static void main(String[] args) {
        Student student1 = new Student("Cian Kelly", "Hello my name is Cian and I am from Ireland", 3977);
        System.out.println(student1.getName());
        System.out.println(student1.getIntroduction());
        System.out.println(student1.getStudentId());

        System.out.println("\n");

        Student student2 = new Student();
        student2.setName("Abhishek Gaikwad");
        student2.setIntroduction("I am the lecturer. This is for testing");
        student2.setStudentId(9839);
        System.out.println(student2.getName());
        System.out.println(student2.getIntroduction());
        System.out.println(student2.getStudentId());
    }
}
