import java.util.Scanner;

public class Min3_01_02_M {

	public static void main(String[] args) {
		//세값의 최솟값을 구하는 min3 메세드를 작성하세요.
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.println("정수를 입력하세요.");
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최솟값은 " +min+"입니다.");
		
	}
	
	static int min3(int a, int b, int c)
	{
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
}
