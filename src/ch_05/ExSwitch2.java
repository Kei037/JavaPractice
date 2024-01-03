package ch_05;

public class ExSwitch2 {

	public static void main(String[] args) {
		
		String medal = "Silver";
		
		switch (medal) {
			case "Gold":
				System.out.println("금메달 입니다.");
				break;
			case "Silver":
				System.out.println("은메달 입니다.");
				break;
			case "Bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
		}
		// 스위치 -> if문
		if (medal.equals("Gold")) {
			System.out.println("금메달 입니다.");
		}else if (medal.equals("Silver")) {
			System.out.println("은메달 입니다.");
		}else if (medal.equals("Bronze")) {
			System.out.println("동메달 입니다.");
		}else {
			System.out.println("메달이 없습니다.");
		}

	}

}
