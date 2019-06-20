import java.util.Comparator;

public class ComparatorUser implements Comparator{
	public int compare(Object obj0, Object obj1) {
		User user0 = (User)obj0;
		User user1 = (User)obj1;
		
		int flag = user0.getAge().compareTo(user1.getAge());
		if(flag == 0) {
			return user0.getName().compareTo(user1.getName());
		}else {
			return flag;
		}
	}
	
}
