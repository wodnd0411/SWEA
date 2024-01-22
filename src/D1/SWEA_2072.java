package D1;
import java.io.FileInputStream;
import java.util.Scanner;

// 2072. 홀수만 더하기
public class SWEA_2072 {

	public static void main(String[] args) throws Exception {
		// input.txt파일로부터 입력을 받을 수 있다
		System.setIn(new FileInputStream("input.txt 경로"));
		
		Scanner scanner = new Scanner(System.in);
		
		int T = 0; // 테스트 케이스 개수
		T = scanner.nextInt(); // 테스트 케이스 개수를 읽어온다
		
		int num = 0; // 정수를 읽어 저장할 공간
		int sum = 0; // 홀수만 뽑아서  합한 값
		
		// 테스트 케이스마다 정수 10개에서 홀수만 뽑아 합한 값 출력 
		for(int test_case = 1; test_case <= T; test_case++) {
			sum = 0; // 각 테스트 케이스별 총합을 구하기 위해 케이스 1개 끝날때마다 0으로 초기화
			
			for(int i = 0; i < 10; i++) {
				num = scanner.nextInt(); // 숫자를 입력 받음
				
				// 홀수만 뽑아서 sum에 합한다
				if(num % 2 != 0) {
					sum += num;
				}
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
	}

}
