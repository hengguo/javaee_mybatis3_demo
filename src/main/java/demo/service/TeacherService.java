package demo.service;

import java.util.Arrays;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import demo.entity.Student;
import demo.entity.Teacher;
import demo.mapper.StudentMapper;
import demo.mapper.TeacherMapper;

@Component
public class TeacherService {
	
	@Resource
	private TeacherMapper teacherDao;
	@Resource
	private StudentMapper studentDao;
	
	public void saveTeacher(){
		Teacher teacher = new Teacher();
		teacher.setId("0001");
		Student s1 = new Student();
		s1.setId("23638175452758016");
		
		teacherDao.insertTeachers(Arrays.asList(teacher));
		studentDao.innertStudent(s1);
	}

}
