package java_encapsulation;

public class test_encapsulation extends employee {

	public static void main(String[] args) {
employee e=new employee();
e.setEdsg("BA");
e.setEid(1);
e.setEname("RAJ");
e.setEsal(50000);

System.out.println("Designation: " + e.getEdsg());
System.out.println("ID: " + e.getEid());
System.out.println("Name: " + e.getEname());
System.out.println("Salary: " + e.getEsal());

	}

}
