package kr.go.mofa.service;

import java.util.List;

import kr.go.mofa.dto.SampleDTO;

public interface SampleService {
	public List<SampleDTO> sample() throws Exception;
	public SampleDTO sampleOne(String id) throws Exception;
}
