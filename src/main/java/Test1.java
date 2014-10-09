import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import demo.entity.Group;
import demo.entity.User;


public class Test1 {

	public static void main(String[] args) throws ParseException {
		Map<User, List<User>> map = new HashMap<User, List<User>>();
		User u1= new User();
		u1.setName("AA");
		List<User> list = new ArrayList<User>();
		list.add(u1);
		map.put(u1, list);
		
		System.out.println(map.get(list.get(0)).get(0).getName());
		
		
		

	}

}
