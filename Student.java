package day15_Collection;

public class Student {

	private String name;
	private int age;
	
	//alt shift s c
	public Student() {
		super();
	}
	
	//alt shift s o
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	//alt shift s r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}
