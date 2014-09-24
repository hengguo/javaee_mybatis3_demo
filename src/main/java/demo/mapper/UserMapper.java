package demo.mapper;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import demo.entity.User;


@Repository("userDao")
public interface UserMapper {

	public User selectUser(Long id);
	public User selectUser(Map<Object, Object> map);

	public User selectUserGroup(Long id);
	
	public void updateUser(User user);
	
	public void batchInsert(List<User> list);
	
	public void insert(User user);

}
