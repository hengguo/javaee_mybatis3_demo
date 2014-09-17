package demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.entity.User;
import demo.mapper.UserMapper;

/**
 * Mybatis 多对多的查询
 * @author wanghengguo
 *
 */
public class Spring_UserGroupTest {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		UserMapper userDao = (UserMapper) ac.getBean("userDao");
		Map map = new HashMap<String, String>();
		map.put("id", 5);
		map.put("type", 5);
		Map map2 = new HashMap<String, String>();
		map2.put("param", map);
		User u = userDao.selectUser(map2);
//		User ug = userDao.selectUserGroup(Long.valueOf(1));
//		System.out.println(u+"\t"+ug);
		System.out.println(u.getId());
	}

}
