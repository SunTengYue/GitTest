class SuperClass{   //父类
	private int n;
	SuperClass(){   //无参
		System.out.println("SuperClass()");
	}
	SuperClass(int n){  //有参
		System.out.println("SuperClass(int n)");
		this.n = n;
	}
}
class SubClass extends SuperClass{
	  private int n;
	  
	  SubClass(){ //无参数
	    System.out.println("SubClass");
	  }  
	  
	  public SubClass(int n){ 
	    super(3);  //有参数
	    System.out.println("SubClass(int n):"+n);
	    this.n = n;
	  }
	}
class SubClass2 extends SuperClass{
	  private int n;
	  
	  SubClass2(){
	    super(3);  //有参数
	    System.out.println("SubClass2");
	  }  
	  
	  public SubClass2(int n){ //无参数
	    System.out.println("SubClass2(int n):"+n);
	    this.n = n;
	  }
	}
public class TestSuperSub {
	public static void main(String args[]) {
		System.out.println("SubClass类继承");
		SubClass sc1 = new SubClass();
		SubClass sc2 = new SubClass(1);
		System.out.println("SubClass2类继承");
		SubClass2 sc3 = new SubClass2();
		SubClass2 sc4 = new SubClass2(2);
	}
}
