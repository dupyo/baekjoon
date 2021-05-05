package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class OneDimenArray {
	
	public static void main(String[] args) throws IOException {
		//1���� �迭
		
		//1�ܰ� - �ּ�, �ִ�
		/*���� : 	N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
			��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
		
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
        int min = 1000000;
        int max = -1000000;
		while(N-- > 0) {
			int num = in.nextInt();
			if(num < min) min=num;
			if(num > max) max=num;
		}
		in.close();
		System.out.print(min+" "+max);
		
	}

}
