package D1;
import java.io.FileInputStream;
import java.util.Scanner;

// 2072. Ȧ���� ���ϱ�
public class SWEA_2072 {

	public static void main(String[] args) throws Exception {
		// input.txt���Ϸκ��� �Է��� ���� �� �ִ�
		System.setIn(new FileInputStream("input.txt ���"));
		
		Scanner scanner = new Scanner(System.in);
		
		int T = 0; // �׽�Ʈ ���̽� ����
		T = scanner.nextInt(); // �׽�Ʈ ���̽� ������ �о�´�
		
		int num = 0; // ������ �о� ������ ����
		int sum = 0; // Ȧ���� �̾Ƽ�  ���� ��
		
		// �׽�Ʈ ���̽����� ���� 10������ Ȧ���� �̾� ���� �� ��� 
		for(int test_case = 1; test_case <= T; test_case++) {
			sum = 0; // �� �׽�Ʈ ���̽��� ������ ���ϱ� ���� ���̽� 1�� ���������� 0���� �ʱ�ȭ
			
			for(int i = 0; i < 10; i++) {
				num = scanner.nextInt(); // ���ڸ� �Է� ����
				
				// Ȧ���� �̾Ƽ� sum�� ���Ѵ�
				if(num % 2 != 0) {
					sum += num;
				}
			}
			
			System.out.println("#" + test_case + " " + sum);
		}
	}

}
