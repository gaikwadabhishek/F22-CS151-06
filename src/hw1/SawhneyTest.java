package hw1;

public class {
  private final String name;
  private final String id;
  private final String loginID;
  private final int year 
  
public Student ( String name, String id, String loginID, int year){
    this.name = name;
    this.id = id;
    this.loginID = loginID;
    this.year = year;
    
    System.out.println("Student with name " + name);
    
    public Student( String name, String id, String loginID){
      this(name, id,loginID,1);
    }
    public String getName(){
      return name;
    }
    public String getid(){
      return id;
    }
    public String getLoginID(){
      return loginID;
    }
    public int getYear(){
      return year;
    }
public static void main(String arg){
  Student s1 = new Student("1234", "student@SJSU.edu");
  Student s2 = new Student("5678", "student@SJSU.edu");                       
}
    
  }
  
}
