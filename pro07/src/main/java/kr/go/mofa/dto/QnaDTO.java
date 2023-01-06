package kr.go.mofa.dto;

import lombok.Data;

@Data
public class QnaDTO {
	//번호, 제목, 내용, 부서, 조회수, 작성일, 그룹번호(질문+답변), 답변여부, 깊이(공개(0)/비밀(1))
	private int no;
	private String title;
    private String content;
    private String dept;
    private int hits;
    private String regdate;
    private int grp;
    private int step;
    private int indent;
}
