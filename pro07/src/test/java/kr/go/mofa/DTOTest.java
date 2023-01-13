package kr.go.mofa;

import org.junit.Assert;
import org.junit.Test;
import kr.go.mofa.dto.SampleDTO;
import lombok.extern.log4j.Log4j;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@Log4j
public class DTOTest {
	
	@Test
	public void test3() {
		SampleDTO dto = new SampleDTO();
		dto.setId("kkk");
		dto.setPw("3333");
		Assert.assertNotNull(dto);
		log.info(dto);
		log.info("----------------------");
		log.info(dto.getId());
	}
}
