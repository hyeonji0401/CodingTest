import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cardNumber = sc.nextInt();
		int sum = sc.nextInt();
		int card[] = new int[cardNumber];
		for(int i=0; i<cardNumber; i++) {
			card[i]=sc.nextInt();
		}
		int bestSum=0;
		for(int j=0; j<cardNumber-2; j++) {
			for(int k=j+1; k<cardNumber-1; k++) {
				for(int m=k+1; m<cardNumber; m++) {
					if((sum-(card[j]+card[k]+card[m]))<=sum-bestSum && (sum-(card[j]+card[k]+card[m]))>=0 ) {
						bestSum=card[j]+card[k]+card[m];
					}
				}
			}
		}
		
		System.out.println(bestSum);

	}

}
