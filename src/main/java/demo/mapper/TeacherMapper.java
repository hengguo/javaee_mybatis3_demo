package demo.mapper;

import java.util.List;

import demo.entity.Teacher;

public interface TeacherMapper {
	public Teacher getTeacherByID(String id);
	public List<Teacher> findTeacherByPage(
			String sort,//排序字段
			String dir,  //排序方向
			int start, //起始记录
			int limit  //记录条数
			);
	
	public void insertTeachers(List<Teacher> teachers);
}
