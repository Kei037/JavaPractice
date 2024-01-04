package ch_06;

public class ExFor {

	public static void main(String[] args) {
		/* float 타입 카운터 변수
		 * for문을 작성할 때 주의할 점은 초기화 식에서 루프 카운터 변수를 선언할 때
		 * 부동 소수점을 쓰는 float 타입을 사용하지 않아야 함
		 * 0.1 float타입으로 정확하게 표현할 수 없기 때문에
		 * x에 더해지는 값이 0.1보다 약간 커서, 루프는 9번 실행
		 * 
		 * float가 double은 계산이 부정확
		 * 자바에서는 정확한 실수 계산을 위해 decimal 클래스를 제공
		 */
		
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}

	}

}
