package kr.go.mofa;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import kr.go.mofa.dto.SampleDTO;
import kr.go.mofa.model.SampleDAO;
import lombok.extern.log4j.Log4j;

@Log4j
public class DAOTest {
	SampleDTO sampleDTO;
	
	@Autowired
	SampleDAO sampleDAO;
	
	@Test
	public void test4() throws Exception {
		SampleDTO sample = new SampleDTO();
		sample.setId("choi");
		sample.setPw("4444");
		Assert.assertNotNull(sample);
		log.info(sample);
		sampleDAO.addSample(sample);
	}
}
