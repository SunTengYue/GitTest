package com.example.ddy.junetwenty;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class STYPerson extends Person{

    private String age;
    private String walk;

    public STYPerson() {

    }
    public STYPerson(String walk) {
        this.walk = walk;

    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("还可以吃肉");
    }

    public void walk() {
        super.walk();
        System.out.print("可以蹦");
    }

    public void walk(String str) {
        System.out.print(str+"可以跳");
    }
}
