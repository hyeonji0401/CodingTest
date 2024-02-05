import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int attend [] = new int[30];
		for(int i=0; i<28; i++)
		{
			int student = sc.nextInt();
			attend[student-1]=student;
		}
		
		for(int j=0; j<30; j++)
		{
			if(attend[j]==0)
			{
				System.out.println(j+1);
			}
		}
		
	}

}