package basic;

public class OneDimenArray {
	
	public static void main(String[] args) {
		//1���� �迭
		
		//1�ܰ� - �ּ�, �ִ�
		/*���� : 	N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		�Է� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
			��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
		��� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.*/
		System.out.println(new OneDimenArray().stage1("20 10 35 30 7"));
	}
	
	public String stage1(String arr) {
		int min=1000000;
		int max=-1000000;
		for(String nStr : arr.split(" ")) {
			int nInt=Integer.parseInt(nStr);
			if(nInt < min)
				min=nInt;
			else {
				if(nInt > max)
					max=nInt;
			}
		}
		return min+" "+max;
	}

}
