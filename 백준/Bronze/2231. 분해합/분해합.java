import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count=0;
		int sum=0;
		
		for(int j=0; j<7; j++) {
			if((num/Math.pow(10, j))>=1) {
				count++;
			}
			else {
				break;
			}
		}
		
		for(int i=1; i<=num; i++) {
			for(int j=0; j<count;j++) { 
				sum+=((i/Math.pow(10, j))%10);
				
			}
			if(sum+i==num) {
			  System.out.print(i);
			  System.exit(0);
			}
			sum=0;
		}
		System.out.print(0);

	}

}
