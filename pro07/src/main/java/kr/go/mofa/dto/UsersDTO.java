package kr.go.mofa.dto;

import lombok.Data;

@Data
public class UsersDTO {
	private String no;
	private String id;
    private String pw;
    private String name;
    private String email;
    private String address;
    private String regdate;
}