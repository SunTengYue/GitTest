import java.util.Random;
/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc 另一种获取随机四位数的方法
 */
public class AnotherNumber {
    public static void main(String[] args){
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int result = 0;
        Random random = new Random();
        for (int i = 1, len = 9, index = 0; i < 5; i++) {
            index = random.nextInt(len);
            result = result * 10 + array[index];
            array[index] = array[len--];
        }
        System.out.println("产生的随机四位数为" + result);
    }
}
