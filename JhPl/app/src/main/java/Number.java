import java.util.Random;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc 生成随机的四位数
 */
public class Number {
    public static void main(String[] args){
        int a ;
        Random f = new Random();
        a = f.nextInt(10000)+1000;
        System.out.println("产生的随机四位数是："+a);
    }

}
