import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	public static void main(String[] args) {
		List userlist = new ArrayList();
		userlist.add(new User("d","4"));
		userlist.add(new User("a","1"));
		userlist.add(new User("e","5"));
		userlist.add(new User("b","2"));
		userlist.add(new User("f","6"));
		userlist.add(new User("c","3"));
		userlist.add(new User("g","7"));
		
		ComparatorUser comparator = new ComparatorUser();
		Collections.sort(userlist,comparator);
		
		for(int i = 0;i<userlist.size(); i++) {
			User user_temp = (User)userlist.get(i);
			System.out.println(user_temp.getAge()+
					"  "+user_temp.getName());
		}
	}
}
