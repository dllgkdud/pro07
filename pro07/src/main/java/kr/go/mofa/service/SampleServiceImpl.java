package kr.go.mofa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.SampleDTO;
import kr.go.mofa.model.SampleDAO;

@Service
public class SampleServiceImpl implements SampleService {

	@Autowired
	SampleDAO sampleDao;
	
	@Override
	public List<SampleDTO> sample() throws Exception {
		return sampleDao.sample();
	}

	@Override
	public SampleDTO sampleOne(String id) throws Exception {
		return sampleDao.sampleOne(id);
	}
}
