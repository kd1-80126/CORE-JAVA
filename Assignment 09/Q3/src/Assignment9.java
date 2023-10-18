
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;



class Studentcompare implements Comparator<Student>
{

	@Override
	public int compare(Student s1, Student s2) {
		int diff=-s1.getCity().compareTo(s2.getCity());
		if(diff==0)
		 diff=-Double.compare(s1.getMarks(), s2.getMarks());
		 if(diff==0)
			  diff=s1.getName().compareTo(s2.getName());
		return diff;
	}
	
}






class Student 
{
	private int roll;
	private String name;
	private String city;
	private double marks;
	
public Student() {
		
	}

	public Student(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(city, marks, name, roll);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(city, other.city)
				&& Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && roll == other.roll;
	}

	

	

	
	
	
}





public class Assignment9 {

	public static void main(String[] args) {
	Student[] arr=new Student[4];
	
      arr[0]=new Student(14,"Akshay","Mumbai",50.2);
      arr[1]=new Student(85,"Manoj","Pune",50.2);
      arr[2]=new Student(55,"Saurabh","Sangli",45.12);
      arr[3]=new Student(66,"Rahul","Mumbai",88.11);
       
      
      for(Student s:arr)
      {
    	  System.out.println(s);
      }
      System.out.println("------------------------------------------------------------");
      Studentcompare name = new Studentcompare();
      Arrays.sort(arr, name);
      System.out.println("After sorting");
      for(Student s:arr)
      {
    	 
    	  System.out.println(s);
      }
	}
	
	
	
}






