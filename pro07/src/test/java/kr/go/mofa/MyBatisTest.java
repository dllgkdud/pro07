package kr.go.mofa;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class MyBatisTest {
	
	@Inject
	private SqlSessionFactory sqlFactory;
	
	@Test
	public void test() {
		log.info("sqlFactory:"+sqlFactory);
	}
	
	@Test
	public void test2() throws Exception {
		try(SqlSession session = sqlFactory.openSession()) {
			log.info("MyBatis session:"+session);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
