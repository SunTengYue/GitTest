
public class Animal {
	private String name;
	private int id;
	public Animal(String myName, int myid) {
		name = myName;
		id = myid;
	}
	public void eat() {
		System.out.println(name+"���ڽ�ʳ");
	}
	public void sleep() {
		System.out.println(name+"����˯��");
	}
	public void introduction() {
		System.out.println("��Һã�����"+id+"��"+name+"��");
	}
}