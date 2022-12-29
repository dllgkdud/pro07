package kr.go.mofa.model;

import java.util.List;

import kr.go.mofa.dto.SampleDTO;

public interface SampleDAO {
	public List<SampleDTO> sample() throws Exception;
	public SampleDTO sampleOne(String id) throws Exception;
}
