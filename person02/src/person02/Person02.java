package person02;

public class Person02 {

	public String name = null;
	public int age = 0;

	public Person02(){}

	public Person02(String name,int age){
		this.name = name;
		this.age = age;
	}

	public Person02(String name){
		this.name = name;
		this.age = 0;
	}

	public Person02(int age){
		this.name = "名前無し";
		this.age = age;
	}

	public Person02(int age, String name){
		this.name = name;
		this.age = age;
	}
}
