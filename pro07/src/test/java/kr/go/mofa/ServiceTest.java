package kr.go.mofa;


import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
@Service
public class ServiceTest {
	
	private DAOTest dao;
	
	@Test
	public void test4() throws Exception {
		int cnt = 5;
		try {
			cnt = serviceCall();
			log.info("회원 수 : "+cnt);
			Assert.assertNotNull(cnt);
		} catch(Exception e) {
			e.printStackTrace();
			fail("실패");
		}
	}

	private int serviceCall() {
		int cnt = dao.daoCall();
		return cnt;
	}
}
