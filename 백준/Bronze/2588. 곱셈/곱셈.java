import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int num1 = A*(B%10);
		int num2 = A*(B%100/10);
		int num3 = A*(B/100);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num1+(num2*10)+(num3*100));
	}

}