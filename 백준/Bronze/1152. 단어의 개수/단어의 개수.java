import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		int count =0;
 		if(sentence.length()==1)
		{
			if(sentence.charAt(0)==' ')
				System.out.print(0);
			else
				System.out.print(1);
		}
 		else {
 			for(int i=0;i<sentence.length()-2; i++)
 			{
 				if((sentence.charAt(i)!=' ')&&(sentence.charAt(i+1)==' '))
 				{
 					if(sentence.charAt(i+2)!=' ')
 					{
 						count++;
 					}
 				}
 			}
 			System.out.print(count+1);
 		}
		

	}

}
