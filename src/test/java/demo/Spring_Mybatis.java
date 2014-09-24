package demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.entity.Student;
import demo.entity.User;
import demo.mapper.StudentMapper;
import demo.mapper.UserMapper;

public class Spring_Mybatis {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		
		UserMapper userDao = (UserMapper) ac.getBean("userDao");
		List list = new ArrayList<User>();
		User u1 = new User();
		u1.setId(Long.valueOf(99));
		userDao.insert(u1);
		User u2 = new User();
		u2.setId(Long.valueOf(99));
		list.add(u1); list.add(u2);
		userDao.insert(u2);
//		userDao.batchInsert(list);
		
//		StudentMapper studentMapper = (StudentMapper) ac.getBean("studentMapper");
//		List<Student> list = new ArrayList<Student>();
//		Student s1 = new Student();s1.setId("23638175452758016");s1.setName("AAA");s1.setGrade("ggggg");
//		Student s2 = new Student();s2.setId("23638175452758017");s2.setName("BBB");s2.setGrade("ggggg");
//		list.add(s1);list.add(s2);
		
//		studentMapper.updateBatch(list);
		
//		Student student = studentDao.getById2("23638175452758017");
//		System.out.println(student.getSupervisor().getResearchArea());
		
//		TeacherMapper teacherMapper = (TeacherMapper) ac.getBean("teacherMapper");
//		Teacher teacher = teacherMapper.getTeacherByID("23638175452758017");
//		System.out.println(teacher.getResearchArea());
		
		//传入多个参数 
//		TeacherMapper teacherMapper = (TeacherMapper) ac.getBean("teacherMapper");
//		List<Teacher> teachers = teacherMapper.findTeacherByPage("t_id", "DESC", 0, 5);
//		System.out.println(teachers.size());
		
		//Spring事务rollback
//		TeacherMapper teacherMapper = (TeacherMapper) ac.getBean("teacherMapper");
//		List<Teacher> teachers = new ArrayList<Teacher>();
//		Teacher t1 = new Teacher();
//		t1.setId("0004");
//		Teacher t2 = new Teacher();
//		t2.setId("0003");
//		teachers.add(t1);
//		teachers.add(t2);
//		teacherMapper.insertTeachers(teachers);
	}

}
