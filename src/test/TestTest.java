package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class birthDate {
	
	private birthDate age ;
	
	birthDate age1 = new birthDate(1899);
	birthDate age2 = new birthDate(1900);
	birthDate age3 = new birthDate(2023);
	birthDate age4 = new birthDate(2024);
	birthDate letter = new birthDate("あ");
	

	public birthDate(int i) {
		age = new birthDate(i);
	}
	
	public birthDate(String string) {
		age = new birthDate(string);
	}

	@Test
	@DisplayName("ケース１")
	public void test1() {
		
		// 文字列を入力 : 期待値 : プログラムエラーにならないこと,西暦は整数で入力して下さいとエラーメッセージが表示
		assertEquals("西暦は整数で入力して下さい",age,birthDate());
	}

	private String birthDate() {
		return null;
	}
	
	
}
