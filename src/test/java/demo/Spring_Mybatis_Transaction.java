package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;

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
		try{
			userService.addUser1();
		}catch(DataAccessException  e){
			if(e.getCause() instanceof MySQLIntegrityConstraintViolationException)
				System.out.println("11111111111111111111111111-----------------------------");
			else 
				e.printStackTrace();
		}
		try{
			userService.addUser2();
		}catch(Exception e){
			System.out.println("222222222222222222222222-----------------------------");
		}
	}

}
