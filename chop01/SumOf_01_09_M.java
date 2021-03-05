import java.util.Scanner;

public class SumOf_01_09_M {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		
		System.out.println("a와 b 사이의 모든 정수의 합을 구합니다. 정수를 입력하세요.");
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		
		int sum = sumof(a,b);
		
		System.out.println("a와 b 사이의 모든 정수의 합은 " + sum + "입니다.");
	}
	
	static int sumof(int a, int b) {
		int start = a;
		int end = b;
		int sum = 0;
		if(b < a)
		{
			start = b;
			end = a;
		}	
		for(int i = start;i<=end;i++)
		{
			sum += i;
		}
		
		return sum;
	}
}