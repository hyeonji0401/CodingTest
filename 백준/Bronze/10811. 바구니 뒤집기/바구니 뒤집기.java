import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int basketNum = sc.nextInt();
		int methodNum = sc.nextInt();
		int basket [] = new int[basketNum];
		
		for(int i=0; i<basketNum; i++)
		{
			basket[i]=i+1;
		}
		
		for(int i=0; i<methodNum; i++)
		{
			int firstBasket = sc.nextInt();
			int endBasket = sc.nextInt();
			
			for(int j=0; j<((endBasket-firstBasket+1)/2); j++)
			{
				int temp = basket[firstBasket+j-1];
				basket[firstBasket+j-1]=basket[endBasket-j-1];
				basket[endBasket-j-1]=temp;
			}
		}
		
		for(int i=0;i<basketNum; i++)
		{
			System.out.print(basket[i]+" ");
		}

	}

}