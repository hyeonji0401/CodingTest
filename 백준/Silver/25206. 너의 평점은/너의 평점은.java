import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		double sum=0;
		double gradeSum=0;
		for(int i=0; i<20; i++)
		{
			str = bf.readLine();
			String grade [] = str.split(" ");
			if(!grade[2].equals("P"))
			{
				gradeSum+=Double.valueOf(grade[1]);
				if(grade[2].equals("A+"))
				{
					sum+=((4.5)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("A0"))
				{
					sum+=((4.0)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("B+"))
				{
					sum+=((3.5)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("B0"))
				{
					sum+=((3.0)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("C+"))
				{
					sum+=((2.5)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("C0"))
				{
					sum+=((2.0)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("D+"))
				{
					sum+=((1.5)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("D0"))
				{
					sum+=((1.0)*(Double.valueOf(grade[1])));
				}
				else if(grade[2].equals("F"))
				{
					sum+=((0.0)*(Double.valueOf(grade[1])));
				}
			}
			
		}
		
		System.out.println(sum/gradeSum);
		
		
	}

}
