package kr.go.mofa.dto;

import lombok.Data;

@Data
public class DataDTO {
	private String uuid;
	private String uploadpath;
	private String filename;
	//filetype default "O"
	private String filetype;
	private int bno;
}
