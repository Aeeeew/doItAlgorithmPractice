import java.util.Scanner;

public class SumForEx_01_07_M {
	//Q7.n이 7이면 '1+2+3+4+5+6+7 = 28'로 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구합니다. 정수를 입력하세요.");
		System.out.print("n : ");
		int n = scan.nextInt();
		int sum = 0;
		for(int i=1; i <= n; i++)
		{
			System.out.print(i);
			if(i<n)
			{
				System.out.print("+");
			}
			sum += i;
		}	
		System.out.print("="+sum);
	}
}
