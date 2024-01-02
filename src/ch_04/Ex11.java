package ch_04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/* 중첩 if문
		 * 아이디, 비밀번호를 입력받아서 로그인 처리
		 * id : java, pass : 1234
		 * 아이디가 맞는경우에는 비밀번호를 입력 받음
		 * 아이디가 틀린 경우에는 에러메세지 출력
		 */
		
		String id, password;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("아이디를 입력해 주세요 : ");
		id = scanner.nextLine();
		
		if (id.equals("java")) {
			System.out.print("비밀번호를 입력해 주세요 : ");
			password = scanner.nextLine();
			if (password.equals("1234")) {
				System.out.println("비밀번호 일치");
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호 불일치");
			}
		}else {
			System.out.println("아이디 불일치");
		}
		
		scanner.close();
	}

}
