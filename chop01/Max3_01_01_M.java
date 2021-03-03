import java.util.Scanner;

public class Max3_01_01_M {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("정수를 입력하세요.");
		System.out.println("a 값 : ");
		a = scan.nextInt(); 
		System.out.println("b 값 : ");
		b = scan.nextInt(); 
		System.out.println("c 값 : ");
		c = scan.nextInt(); 
		System.out.println("d 값 : ");
		d = scan.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("최대값은 " + max + " 입니다.");
		
	}
	static int max4 (int a, int b, int c, int d)
	{
		int max = a;
		if(max < b) max = b;
		if(max < c) max = c;
		if(max < d) max = d;
		return max;
	}

}
