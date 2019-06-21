/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
class StudentNeed{
    public static void main(String args[]){
        Student stu1 = new Student();
        stu1.setName("金吒");
        stu1.setAge(50);
        System.out.println(stu1.getName()+stu1.getAge());
        Student stu2 =new Student();
        stu2.setName("银吒");
        stu2.setAge(25);
        System.out.println(stu2.getName()+stu2.getAge());
        Student stu3 =new Student();
        stu3.setName("李狗蛋");
        stu3.setAge(3);
        System.out.println(stu3.getName()+stu3.getAge());
    }
}
public class Student {
    private String name;
    private int age;

    public void setAge(int age){
        if (age > 0 && age < 150) {
            this.age = age;
            //System.out.println(age);
        }else {
            System.out.println("已超出地球人的极限");
        }
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name = name;
        //System.out.println(name);
    }
    public String getName(){
        return name;
    }
}

