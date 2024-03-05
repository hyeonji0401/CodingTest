import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String num = bf.readLine();
		
		int count =0;
		for(int i=0; i<Integer.valueOf(num); i++)
		{
			boolean isGroup = true;
			String word = bf.readLine();
			if(word.length()!=1)
			{
				for(int j=0; j<word.length()-1; j++)
				{
					if(word.charAt(j)==word.charAt(j+1))
					{
						continue;
					}
					String temp=word.substring(j+1, word.length());
					if(temp.contains(String.valueOf(word.charAt(j))))
							isGroup=false;
					
				}
			}
			if(isGroup)
				count++;
		}
		
		System.out.println(count);

	}

}