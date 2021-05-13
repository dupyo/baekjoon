package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class OneDimenArray {
	
	public static void main(String[] args) throws IOException {
		
		//1차원 배열
		//1단계 - 최소, 최대 (최솟값과 최댓값을 찾는 문제)
//		new OneDimenArray().stage1();
		//2단계 - 최댓값 (최댓값이 어디에 있는지 찾는 문제)
//		new OneDimenArray().stage2();
		//3단계 - 숫자의 개수 (각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제)
//		new OneDimenArray().stage3();
		//4단계 - 나머지
//		new OneDimenArray().stage4();
		//5단계 - 평균(평균을 조좍하는 문제)
		new OneDimenArray().stage5();
		
	}
	
	public void stage1() throws IOException {
		
		//1단계 - 최소, 최대 (최솟값과 최댓값을 찾는 문제)
		/*문제 : 	N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
		입력 : 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
			모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
		출력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		예제 입력
		5
		20 10 35 30 7
		예제 출력
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
		
		//2단계 - 최댓값 (최댓값이 어디에 있는지 찾는 문제)
		/* 문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
		예를 들어, 서로 다른 9개의 자연수
		3, 29, 38, 12, 57, 74, 40, 85, 61
		이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
		입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
		출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
		예제 입력
		3, 29, 38, 12, 57, 74, 40, 85, 61
		예제 출력
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
		
		//3단계 - 숫자의 개수 (각 숫자가 몇 번 나왔는지 저장하기 위해 일차원 배열을 만드는 문제)
		/*문제 : 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
			예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
		입력 : 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
		출력 : 첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		예제 입력
		150
		266
		427
		예제 출력
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
			arr[(strABC.charAt(i) - '0')]++;		//인덱스 값 +1 (char 타입의 아스키코드 개념 활용) from 	아이디:gnsrudfk
		 */
	}
	
	public void stage4() throws IOException {
		
		//4단계 - 나머지
		/*문제: 두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다. 
			수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
		입력 : 첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
		출력 : 첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.*/
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
		
		//5단계 - 평균(평균을 조좍하는 문제)
		/*문제 : 세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
		예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
		세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
		입력 : 첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
		출력 : 첫째 줄에 새로운 평균을 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-2 이하이면 정답이다.*/
		
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
