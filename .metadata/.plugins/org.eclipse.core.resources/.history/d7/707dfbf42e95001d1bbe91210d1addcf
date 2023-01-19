package kr.go.mofa;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void test1() {
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/government?serverTimezone=Asia/Seoul");
			log.info(con+"의 연결이 정상적으로 완료되었습니다.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
