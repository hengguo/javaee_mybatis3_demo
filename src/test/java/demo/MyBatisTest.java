package demo;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
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
		StudentMapper userMapper = sqlSession.getMapper(StudentMapper.class);
		Student s = userMapper.getById1("23638175452758017");
		System.out.println(s.getSupervisor().getName());

	}

}