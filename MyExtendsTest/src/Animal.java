
public class Animal {
	private String name;
	private int id;
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat() {
		System.out.println(name+"正在进食");
	}
	public void sleep() {
		System.out.println(name+"正在睡觉");
	}
	public void introduction() {
		System.out.println("大家好，我是"+id+"号"+name+"。");
	}
}
