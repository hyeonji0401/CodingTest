import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		int arr []= new int[26];

		for(int i=0; i<s.length(); i++)
		{
			arr[s.charAt(i)-65]++;
		}
		
		int Max =0;
		for(int i=0; i<26; i++)
		{
			if(arr[i]>arr[Max])
				Max=i;
		}
		
		boolean isSame=false;
		for(int i=0; i<26; i++)
		{
			if((i!=Max)&&(arr[i]==arr[Max]))
			{
				isSame=true;
				break;
			}
		}
		
		if(isSame)
			System.out.println("?");
		else
			System.out.println((char)(Max+65));
		
		
	}

}
