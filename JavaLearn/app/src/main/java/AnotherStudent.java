/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
class StudentOP{
    public static void main(String[] args){
        AnotherStudent AS = new AnotherStudent();

        AS.setName("孙腾跃");
        AS.setAge(22);
        AS.setSex("男");

        System.out.println(AS.getName()+AS.getSex()+ AS.getAge());

        AS.sleep();
        AS.study();
    }
}
public class AnotherStudent {
    String name;
    int age;
    String sex;

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void study(){
        System.out.println("学习");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
}
