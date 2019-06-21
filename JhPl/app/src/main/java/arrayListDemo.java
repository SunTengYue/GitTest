import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author sty
 * @date 2019/06/17 9:52
 * @desc
 */
public class arrayListDemo {
    public static void main(String[] args) {

        List<String> mlist = new ArrayList<String>();
        mlist.add("banana");
        mlist.add("avocado");
        mlist.add("apple");
        mlist.add("aaa");
        mlist.add("abc");
        mlist.add("kiwifruit");
        mlist.add("");



        List<String> mlist2 = new ArrayList<String>();

        for (int i = 0; i < mlist.size(); i++) {
            String str = mlist.get(i);
            System.out.println(str);
            if (mlist.get(i).isEmpty()) {
                mlist2.add(mlist.get(i));

            }
        }
        System.out.print(mlist);

        //mlist2.add("");

        //mlist.removeAll(mlist2);

        //System.out.print(mlist);
        //System.out.print("\n");
        /*Iterator<String> it = mlist.iterator();
        while(it.hasNext()) {
            String s = it.next();
            if(s.startsWith("a")){
                it.remove();
            }
        }*/
        //System.out.println(mlist);
    }
}
