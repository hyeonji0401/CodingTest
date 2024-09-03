import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum=0;
		int result=0;
		
		for(int i=1; i<num; i++) {
			sum=0;
			int cal = i;
			while(cal!=0) {
				sum+=cal%10;
				cal/=10;
			}
			if(sum+i==num) {
				result=i;
				break;
			}
		}
		System.out.println(result);

	}

}
