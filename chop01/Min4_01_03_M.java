import java.util.Scanner;

public class Min4_01_03_M {
	//네 값의 최솟값을 구하는 min4 메서드를 작성하세요.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		
		System.out.println("네 값의 최솟값을 구합니다. 정수를 입력하세요.");
		System.out.print("a : ");
		a = scan.nextInt();
		System.out.print("b : ");
		b = scan.nextInt();
		System.out.print("c : ");
		c = scan.nextInt();
		System.out.print("d : ");
		d = scan.nextInt();
		
		int min = min4(a, b, c, d);
		
		System.out.println("최솟값은 " +min+"입니다.");
	}
	
	static int min4(int a, int b, int c, int d)
	{
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		if(d < min) min = d;
		return min;
	}
}
