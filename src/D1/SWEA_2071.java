package D1;

import java.io.FileInputStream;
import java.util.Scanner;

// 2071. ��հ� ���ϱ�
public class SWEA_2071 {

	public static void main(String[] args) throws Exception {
		// �ؽ�Ʈ ������ �Է����� �޴´�.
		System.setIn(new FileInputStream("C:\\eclipse-workspace\\SWEA\\src\\D1\\SWEA_2071.txt"));
		
		// ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�´�.
		Scanner sc = new Scanner(System.in);
		
		int T; // �׽�Ʈ ���̽� ����
		T = sc.nextInt();
		
		int sum = 0;
		double avg = 0;
		
		for(int test_case = 1; test_case <= T; test_case++) {
			sum = 0;
			
			// ���� 10���� ����
			for(int i = 0; i < 10; i++) {
				sum += sc.nextInt();
			}
			
			// ���� 10���� ���� ���
			avg = sum / 10d;
			
			// Math.round()�� �Ҽ��� ù°�ڸ����� �ݿø��� �ϰ� ����� ������ ����Ѵ�.
			System.out.println("#" + test_case + " " + avg);
			
//			// Math.round() ������� �ʰ� ���ϱ�
//			avg = sum / 10d + 0.5;
//			System.out.println("#" + test_case + " " + (int)avg);
		}
	}

}
