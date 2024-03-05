import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String str[]= {"c=","c-","dz=", "d-","lj","nj","s=","z="};
		
		String st = bf.readLine();
		
		for(int i=0; i<str.length; i++)
		{
			//contains: 대상 문자열에 특정 문자열이 포함되어있는지 확인
			if(st.contains(str[i]))
				st = st.replace(str[i], "!");
			//찾으려는 문자에 포함안되는 문자로 바꿔줘야함
		}
		
		System.out.println(st.length());
	}
}
