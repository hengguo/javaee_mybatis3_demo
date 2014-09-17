package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.entity.Student;
import demo.entity.User;
import demo.mapper.StudentMapper;
import demo.mapper.UserMapper;

public class Spring_Mybatis {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		
//		UserMapper userDao = (UserMapper) ac.getBean("userDao");
//		User user = new User();
//		user.setId(1);
//		user.setName("a");
//		userDao.updateUser(user);
//		ac.getBean("sqlSessionFactory");
		
		StudentMapper studentDao = (StudentMapper) ac.getBean("studentMapper");
		Student student = studentDao.getById2("23638175452758017");
		System.out.println(student.getSupervisor().getResearchArea());
		
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
