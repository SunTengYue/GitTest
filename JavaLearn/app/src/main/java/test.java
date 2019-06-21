import java.util.Random;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class test {
    public void random(){
        int i = 0;
        int j = 0;
        Random random = new Random(100);
        Random random1 = new Random(100);
        i = random.nextInt();
        j = random1.nextInt();
        System.out.println(i+"\n"+j);
    }
    public static void main(String[] args){
        test k = new test();
        k.random();
    }
}
