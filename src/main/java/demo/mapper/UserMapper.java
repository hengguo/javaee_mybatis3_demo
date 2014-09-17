package demo.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import demo.entity.User;


@Repository("userDao")
public interface UserMapper {

	public User selectUser(Long id);
	public User selectUser(Map<Object, Object> map);

	public User selectUserGroup(Long id);
	
	public void updateUser(User user);

}
