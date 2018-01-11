package AA;

public class Student {
	int rollno;
	String name;
	String city;
	Student(int rollno,String name,String city){
		this.rollno=rollno;
		this.name=name;
		this.city=city;
	}
	void display(){
		System.out.println(rollno+"  "+name+"  "+city);		
	}
	public static void main(String[] args) {
		Student s1=new Student(310,"prem","vijayawada");
		Student s2=new Student(311,"kumar","hydrabad");
		System.out.println(s1);
		System.out.println(s2);
		s1.display();
		s2.display();
	}
	

}
