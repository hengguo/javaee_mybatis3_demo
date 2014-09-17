package demo.mapper;

import demo.entity.User;

public interface GroupMapper {

	public User selectGroup(Long id);
	public User selectGroupUser(Long id);

}
