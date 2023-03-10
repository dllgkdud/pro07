package kr.go.mofa.model;

import org.apache.ibatis.annotations.Insert;

import kr.go.mofa.dto.DataDTO;

public interface DataDAO {
	@Insert("INSERT INTO data(uuid, uploadpath, filename, filetype, bno)"
	 +"VALUES(#{uuid}, #{uploadpath}, #{filename}, #{filetype}, #{bno})") 
	 public int addData(DataDTO dto);
}
