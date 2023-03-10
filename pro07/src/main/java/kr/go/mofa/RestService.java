package kr.go.mofa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.go.mofa.dto.SampleDTO;

@Service
public class RestService {

	@Autowired
	RestDAO restDao;
	
	public Map<String, String> getTest1(String id, String pw) {
		Map<String, String> res = new HashMap<>();
		res.put(id, pw);
		return res;
	}

	public List<String> getTest2(String id) {
		List<String> lst = new ArrayList<>();
		for(int i=0;i<5;i++) {
			lst.add(id+i);
		}
		return lst;
	}

	public List<SampleDTO> sampleList() throws Exception {
		return restDao.list();
	}

	public SampleDTO getSample(String id) throws Exception {
		return restDao.one(id);
	}

	public void addSample(SampleDTO sample) throws Exception {
		restDao.add(sample);
	}
	
	public void updSample(SampleDTO sample) throws Exception {
		restDao.upd(sample);
	}
	
	public void delSample(String id) throws Exception {
		restDao.del(id);
	}
}
