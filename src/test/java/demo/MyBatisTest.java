package demo;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import demo.entity.Student;
import demo.mapper.StudentMapper;


/**
 * myBatis数据库连接测试
 * 
 * @author db2admin
 * 
 */
public class MyBatisTest {
	/**
	 * 获得MyBatis SqlSessionFactory  
	 * SqlSessionFactory负责创建SqlSession，一旦创建成功，就可以用SqlSession实例来执行映射语句，commit，rollback，close等方法。
	 * @return
	 */
	private static SqlSessionFactory getSessionFactory() {
		SqlSessionFactory sessionFactory = null;
		InputStream stream=Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis.xml");
		sessionFactory = new SqlSessionFactoryBuilder().build(stream);
		return sessionFactory;
	}

	public static void main(String[] args) {
		SqlSession sqlSession = getSessionFactory().openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student();s1.setId("23638175452758016");s1.setName("AAA");
		Student s2 = new Student();s2.setId("23638175452758017");s2.setName("BBB");
		list.add(s1);list.add(s2);
		
		studentMapper.updateBatch(list);
//		Student s = userMapper.getById1("23638175452758017");
//		System.out.println(s.getSupervisor().getName());

	}

}