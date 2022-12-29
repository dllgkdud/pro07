package kr.go.mofa.dto;

import lombok.Data;

@Data
public class NoticeDTO {
	private int no;
    private String title;
    private String content;
    private String dept;
    private String regdate;
    private int hits;
}
