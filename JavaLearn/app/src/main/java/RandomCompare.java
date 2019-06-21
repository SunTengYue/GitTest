import java.util.Random;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class RandomCompare {
    public void main(){
        Random r = new Random();

        int n5 = r.nextInt(100);

        int m;

        if(n5 < 55){

            m = 1;

        }else if(n5 < 95){

            m = 2;

        }else{

            m = 3;

        }

        System.out.println(m);

    }
    public static void main(String[] args){

        RandomCompare k = new RandomCompare();
        k.main();

    }
}
