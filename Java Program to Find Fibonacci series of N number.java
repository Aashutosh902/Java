import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number until you want FIBONACCI series");
		int n = sc.nextInt();
		int a=1; int b=2;
		System.out.println(a+" ");
		System.out.println(b+" ");
		int c=a+b;
		for(int i=3; i<n; i++)
		{
			c=c+i;
			System.out.println(c+" ");
		}
	}
}