import java.util.Scanner;

public class SumGauss_01_08_M {
	//Q8. 가우스 덧셈
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다. 정수를 입력하세요.");
		System.out.print("n : ");
		int n = scan.nextInt();
		
		int sum = (1+n)*(n/2);
		
		if(n % 2 == 1)
		{
			sum += (1+n)/2;
		}
		
		System.out.println("총합 : " + sum);
	}
}
