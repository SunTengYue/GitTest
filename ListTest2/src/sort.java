import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class sort {

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User("A",12));
		list.add(new User("C",3));
		list.add(new User("B",4));
		list.add(new User("D",32));
		Collections.sort(list);
		System.out.println(list.toString());
	}
}
class User implements Comparable<User>{

	private String name;

	private int age;

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
		return "User name="+name+" age="+age + "\n";
	}

	@Override
	public int compareTo(User user) {           
		return this.age - user.getAge();
		//return this.name.charAt() - user.getName().charAt();
		}
}
