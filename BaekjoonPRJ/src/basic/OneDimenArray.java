package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class OneDimenArray {
	
	public static void main(String[] args) throws IOException {
		//1���� �迭
		
		//1�ܰ� - �ּ�, �ִ�
		/*���� : 	N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
			��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
		
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

}
