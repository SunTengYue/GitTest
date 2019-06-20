import com.example.ddy.junetwenty.STYPerson;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class Test {
    public static void main(String[] args){
//        System.out.println("开始执行main方法");
//        new Test().hello();
//        new Test().hello();

        STYPerson styPerson = new STYPerson();

        styPerson.eat();

        styPerson.walk();

        styPerson.walk("可以奔跑");

    }
    static {

    }

    {
        System.out.println("构造代码块");
    }
    public Test(){
        System.out.println("构造函数");
    }

    public void hello(){
        System.out.println("普通代码块");
    }

}
