import java.io.FileInputStream;
import java.util.Scanner;

// �������� Ȯ���� ���� �� ��ȯ
public class SWEA_1206 {

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("C:\\eclipse-workspace\\SWEA\\src\\SWEA_1206.txt"));
		
		Scanner sc = new Scanner(System.in);

		int buildingNum = 0; // �ǹ��� ����
		int count = 0; // �������� Ȯ���� ���� ����
		int leftBuilding = 0; // �� �ǹ��� �������� ���� �ǹ� �� ū �ǹ�
		int rightBuilding = 0; // �� �ǹ��� �������� ������ �ǹ� �� ū �ǹ�
		
		// �׽�Ʈ ���̽� 10��
		for(int test_case = 1; test_case <= 10; test_case++) {
			buildingNum = sc.nextInt(); // �ǹ� ���� �Է¹���
			
			int[] floor = new int[buildingNum]; // �ǹ����� �ǹ��� ���̸� ������ �迭
			
			count = 0; // �׽�Ʈ ���̽����� �ʱ�ȭ
			
			// �� �ǹ��� ���̸� �迭�� ����
			for(int i = 0; i < floor.length; i++) {
				floor[i] = sc.nextInt();
			}
			
			// �� ���ʰ� �� ������ �� ĭ�� ����
			// �� �ǹ��� �������� ���� �ǹ� �� ���� ������ �ǹ� �� �� ���� Ŀ���� -> ������ ����
			// leftBuilding = �� �ǹ��� �������� ���ʿ� �ִ� �� �� �ǹ� �� ū �ǹ� ����
			// rightBuilding = �� �ǹ��� �������� �����ʿ� �ִ� �� �� �ǹ� �� ū �ǹ� ����
			// ������ ���� �ǹ����� ���ʰ� ������ �ǹ� �� ū �ǹ��� ��� ���� ������ Ȯ�� ���밡 ������
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
