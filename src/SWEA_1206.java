import java.io.FileInputStream;
import java.util.Scanner;

// 조망권이 확보된 세대 수 반환
public class SWEA_1206 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("C:\\eclipse-workspace\\SWEA\\src\\SWEA_1206.txt"));
		
		Scanner sc = new Scanner(System.in);

		int buildingNum = 0; // 건물의 개수
		int count = 0; // 조망권이 확보된 세대 개수
		int leftBuilding = 0; // 한 건물을 기준으로 왼쪽 건물 중 큰 건물
		int rightBuilding = 0; // 한 건물을 기준으로 오른쪽 건물 중 큰 건물
		
		// 테스트 케이스 10개
		for(int test_case = 1; test_case <= 10; test_case++) {
			buildingNum = sc.nextInt(); // 건물 개수 입력받음
			
			int[] floor = new int[buildingNum]; // 건물마다 건물의 높이를 저장할 배열
			
			count = 0; // 테스트 케이스마다 초기화
			
			// 각 건물의 높이를 배열에 저장
			for(int i = 0; i < floor.length; i++) {
				floor[i] = sc.nextInt();
			}
			
			// 맨 왼쪽과 맨 오른쪽 두 칸은 제외
			// 한 건물을 기준으로 왼쪽 건물 두 개와 오른쪽 건물 두 개 보다 커야함 -> 조망권 생김
			// leftBuilding = 한 건물의 기준으로 왼쪽에 있는 두 개 건물 중 큰 건물 선택
			// rightBuilding = 한 건물의 기준으로 오른쪽에 있는 두 개 건물 중 큰 건물 선택
			// 기준을 잡은 건물에서 왼쪽과 오른쪽 건물 중 큰 건물을 골라 빼면 조망권 확보 세대가 구해짐
			for(int i = 2; i < floor.length - 2; i++) {
				if(floor[i] > floor[i - 1] && floor[i] > floor[i - 2]) {
					if(floor[i] > floor[i + 1] && floor[i] > floor[i + 2]) {
						leftBuilding = (floor[i - 1] > floor[i - 2]) ? floor[i - 1] : floor[i - 2];
						rightBuilding = (floor[i + 1] > floor[i + 2]) ? floor[i + 1] : floor[i + 2];
						
						count = count + floor[i] - ((leftBuilding > rightBuilding) ? leftBuilding : rightBuilding);
					}
					else {
						continue;
					}
				}
			}
			
			System.out.println("#" + test_case + " " + count);
		}
	}

}
