package demo.mapper;

import java.util.List;

import demo.entity.Student;

public interface StudentMapper {
	/**
	 * 嵌套的resultMap語句
	 * @param id
	 * @return
	 */
	public Student getById1(String id);
	
	/**
	 * 嵌套的SELECT語句
	 * @param id
	 * @return
	 */
	public Student getById2(String id);

	public void innertStudent(Student student);
	
	/**
	 * 批量的更新操作
	 * @param list
	 */
	public void updateBatch(List<Student> list);
}
