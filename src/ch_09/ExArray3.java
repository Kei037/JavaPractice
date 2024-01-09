package ch_09;

public class ExArray3 {

	public static void main(String[] args) {
		/*
		 * 각 행의 열의 갯수가 다른 경우
		 */
		int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
		
		int sum = 0;
		double avg = 0;
		
		int count = 0;  // 각각의 갯수가 다른 2차원 배열이라 식으로 구할 수 없고, 카운팅 해야 함
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum += array[i][j];
				count++;
			}
		}
		avg = (double)sum / count;
		
		System.out.println("total = " + sum);
		System.out.println("average = " + avg);
		
	}

}