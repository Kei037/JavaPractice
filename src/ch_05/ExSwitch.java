package ch_05;

public class ExSwitch {

	public static void main(String[] args) {
		// 일년 동안 읽은 책 수에 따라 멘트를 출력합니다.
		int book = 5;
		
		switch (book / 10) {
			case 0: 
				System.out.println("조금 더 노력 하세요!");
				break;
			case 1:
				System.out.println("책 읽는 것을 즐기는 분이시네요!");
				break;
			case 2:
				System.out.println("책을 사랑하는 분이시네요!");
				break;
			default:
				System.out.println("당신은 다독왕입니다!");
		}
		
	}

}
