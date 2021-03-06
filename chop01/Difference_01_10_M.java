import java.util.Scanner;

public class Difference_01_10_M {
	//Q.10 두 변수 a,b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b = 0;
		System.out.print("a의 값: ");
		a = scan.nextInt();
		/*
		방법1.
		System.out.print("b의 값 : ");
		b = scan.nextInt();
		
		while(a > b)
		{
			System.out.println("a보다 큰값을 입력하세요!");
			
			System.out.print("b의 값 : ");
			b = scan.nextInt();
		}
		*/
		//방법2.
		Boolean flag = true;
		while(flag)
		{
			System.out.print("b의 값 : ");
			b = scan.nextInt();
			
			if(a > b)
			{
				System.out.println("a보다 큰값을 입력하세요!");
			}
			else
			{
				flag = false;
			}	
		}
		
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}