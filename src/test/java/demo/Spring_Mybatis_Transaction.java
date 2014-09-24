package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.service.UserService;

/**
 * Mybatis 事务的控制
 *
 */
public class Spring_Mybatis_Transaction {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("spring/beans.xml");
		
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
		UserService userService = (UserService) ac.getBean("userService");
		userService.addUser1();
	}

}
