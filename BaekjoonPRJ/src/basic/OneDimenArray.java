package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class OneDimenArray {
	
	public static void main(String[] args) throws IOException {
		
		//1���� �迭
		//1�ܰ� - �ּ�, �ִ� (�ּڰ��� �ִ��� ã�� ����)
//		new OneDimenArray().stage1();
		//2�ܰ� - �ִ� (�ִ��� ��� �ִ��� ã�� ����)
//		new OneDimenArray().stage2();
		//3�ܰ� - ������ ���� (�� ���ڰ� �� �� ���Դ��� �����ϱ� ���� ������ �迭�� ����� ����)
//		new OneDimenArray().stage3();
		//4�ܰ� - ������
//		new OneDimenArray().stage4();
		//5�ܰ� - ���(����� �����ϴ� ����)
		new OneDimenArray().stage5();
		
	}
	
	public void stage1() throws IOException {
		
		//1�ܰ� - �ּ�, �ִ� (�ּڰ��� �ִ��� ã�� ����)
		/*���� : 	N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
			��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
		���� �Է�
		5
		20 10 35 30 7
		���� ���
		7 35*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());

		int max = -1000001;
		int min = 1000001;

		while(st.hasMoreElements()) {
			int num = Integer.parseInt(st.nextToken());
			if(num > max) max=num;
			if(num < min) min=num;
		}
		System.out.println(min+" "+max);
	}
	
	public void stage2() throws IOException {
		
		//2�ܰ� - �ִ� (�ִ��� ��� �ִ��� ã�� ����)
		/* ���� : 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		���� ���, ���� �ٸ� 9���� �ڿ���
		3, 29, 38, 12, 57, 74, 40, 85, 61
		�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
		�Է� : ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
		��� : ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
		���� �Է�
		3, 29, 38, 12, 57, 74, 40, 85, 61
		���� ���
		85
		8*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = 0;
		int val_idx = 0;
		int val = 1;
		while(k++ < 9) {
			int n = Integer.parseInt(br.readLine());
			if(n > val) {
				val=n;
				val_idx=k;
			}
		}
		System.out.println(val+"\n"+val_idx);
		
	}
	
	public void stage3() throws IOException {
		
		//3�ܰ� - ������ ���� (�� ���ڰ� �� �� ���Դ��� �����ϱ� ���� ������ �迭�� ����� ����)
		/*���� : �� ���� �ڿ��� A, B, C�� �־��� �� A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
			���� ��� A = 150, B = 266, C = 427 �̶�� A �� B �� C = 150 �� 266 �� 427 = 17037300 �� �ǰ�, ����� ��� 17037300 ���� 0�� 3��, 1�� 1��, 3�� 2��, 7�� 2�� ������.
		�Է� : ù° �ٿ� A, ��° �ٿ� B, ��° �ٿ� C�� �־�����. A, B, C�� ��� 100���� ũ�ų� ����, 1,000���� ���� �ڿ����̴�.
		��� : ù° �ٿ��� A �� B �� C�� ����� 0 �� �� �� �������� ����Ѵ�. ���������� ��° �ٺ��� �� ��° �ٱ��� A �� B �� C�� ����� 1���� 9������ ���ڰ� ���� �� �� �������� ���ʷ� �� �ٿ� �ϳ��� ����Ѵ�.
		���� �Է�
		150
		266
		427
		���� ���
		3
		1
		0
		2
		0
		0
		0
		2
		0
		0*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ABC = 1;
		for(int i=0; i < 3; i++) 
			ABC*=Integer.parseInt(br.readLine());
		
		int[] arr = new int [10];
		String strABC = String.valueOf(ABC);
		for(int i=0; i < 10; i++) {
			arr[i]=strABC.length()-strABC.replaceAll(""+i, "").length();
			System.out.println(arr[i]);
		}
		/*for (int i = 0; i < strABC.length(); i++)
			arr[(strABC.charAt(i) - '0')]++;		//�ε��� �� +1 (char Ÿ���� �ƽ�Ű�ڵ� ���� Ȱ��) from 	���̵�:gnsrudfk
		 */
	}
	
	public void stage4() throws IOException {
		
		//4�ܰ� - ������
		/*����: �� �ڿ��� A�� B�� ���� ��, A%B�� A�� B�� ���� ������ �̴�. ���� ���, 7, 14, 27, 38�� 3���� ���� �������� 1, 2, 0, 2�̴�. 
			�� 10���� �Է¹��� ��, �̸� 42�� ���� �������� ���Ѵ�. �� ���� ���� �ٸ� ���� �� �� �ִ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٺ��� ����° �� ���� ���ڰ� �� �ٿ� �ϳ��� �־�����. �� ���ڴ� 1,000���� �۰ų� ����, ���� �ƴ� �����̴�.
		��� : ù° �ٿ�, 42�� �������� ��, ���� �ٸ� �������� �� �� �ִ��� ����Ѵ�.*/
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] mod = new int [10];
		int cnt = 0;
		int dup = 42;
		for(int i=0; i < 10; i++)
			mod[i]=Integer.parseInt(br.readLine())%42;
		
		Arrays.sort(mod);
		for(int n : mod) {
			if(dup == n)
				continue;
			dup=n;
			cnt++;
		}
		System.out.println(cnt);*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i < 10; i++)
			set.add(Integer.parseInt(br.readLine())%42);
		
		System.out.println(set.size());
		
	}
	
	public void stage5() throws IOException {
		
		//5�ܰ� - ���(����� �����ϴ� ����)
		/*���� : �����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
		���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
		�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
		��� : ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		String[] scores = br.readLine().split(" ");
		int[] arr = new int [size];
		int max = 0;
		float sum = 0;
		for(int i=0; i < size; i++) {
			arr[i]=Integer.parseInt(scores[i]);
			max=(max < arr[i]) ? arr[i] : max;
		}
		for(int i=0; i < size; i++)
			sum+=(float)arr[i]/max*100;
		System.out.println(sum/size);
	}

}
