package implement_Power_Function;

import java.util.Scanner;

/*
    Implement pow(A, B) % C. In other words, given A, B and C, Find (AB % C).
	Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
	

	Input 1:
	A = 2
	B = 3
	C = 3
	
	Input 2:
	A = 3
	B = 3
	C = 1
	

	Output 1:
	2
	
	Output 2:
	0
 */
public class Implement_Power_function {
	
	private static void power(int a, int b, int c, int result) {
		// TODO Auto-generated method stub
		if(b==0)
		{
			System.out.println(a%c);
			return;
		}
		
		result=result*a;
		power(a,b-1,c,result);
		
	}

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		int c=scanner.nextInt();
		power(a,b,c,1);
		
	}
}
