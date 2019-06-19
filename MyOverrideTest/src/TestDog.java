class Animal{
   public void move(){
      System.out.println("动物可以移动");
   }
}
 
class Dog extends Animal{
   public void move(){
      System.out.println("狗可以跑和走");
   }
}
public class TestDog {
	public static void main(String args[]){
	      Animal a = new Animal(); // Animal对象
	      Animal b = new Dog(); // Dog对象
	 
	      a.move();// 执行 Animal类的方法
	 
	      b.move();//执行 Dog类的方法
	   }
}
