package D1;

import java.io.FileInputStream;
import java.util.Scanner;

// 2071. 평균값 구하기
public class SWEA_2071 {

	public static void main(String[] args) throws Exception {
		// 텍스트 파일을 입력으로 받는다.
		System.setIn(new FileInputStream("C:\\eclipse-workspace\\SWEA\\src\\D1\\SWEA_2071.txt"));
		
		// 표준입력 System.in 으로부터 스캐너를 만들어 데이터를 읽어온다.
		Scanner sc = new Scanner(System.in);
		
		int T; // 테스트 케이스 개수
		T = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			sum = 0;
			
			// 정수 10개의 총합
			for(int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			
			// 정수 10개에 대한 평균
			avg = sum / 10d;
			
			// Math.round()는 소수점 첫째자리에서 반올림을 하고 결과를 정수를 출력한다.
			System.out.println("#" + test_case + " " + avg);
			
//			// Math.round() 사용하지 않고 구하기
//			avg = sum / 10d + 0.5;
//			System.out.println("#" + test_case + " " + (int)avg);
		}
	}

}
