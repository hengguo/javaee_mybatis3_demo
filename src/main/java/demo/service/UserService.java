package demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import demo.entity.User;
import demo.mapper.UserMapper;

@Service("userService")
public class UserService {
	
	@Resource
	private UserMapper userDao;
	
	/**
	 * 测试在spring默认事务下，   一个transaction 一个方法内  一条语句成功， 一条语句失败的结果：</br>
	 * 会自动rollback
	 */
	public void addUser1(){
		
		addUser2();
		List list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(Long.valueOf(99));
		userDao.insert(u1);
		User u2 = new User();
		u2.setId(Long.valueOf(99));
		list.add(u1); list.add(u2);
		userDao.insert(u2);
		
	}
	
	/**
	 * 测试在spring默认事务下，   一个transaction下一条语句成功， 一条语句失败的结果：</br>
	 * 
	 */
	public void addUser2(){
		List list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(Long.valueOf(100));
		userDao.insert(u1);
		User u2 = new User();
		u2.setId(Long.valueOf(101));
		list.add(u1); list.add(u2);
		userDao.insert(u2);
	}

}
