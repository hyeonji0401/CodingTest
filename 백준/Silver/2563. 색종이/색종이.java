import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int overlapSum = 0;
        int paper[][] = new int[100][100];
        
        for(int i=0; i<num; i++) {
        	int x = sc.nextInt();
        	int y=sc.nextInt();
        	for(int n=0; n<10; n++) {
        		for(int m=0; m<10; m++) {
        			paper[x+n][y+m]=1;
        		}
        		
        	}
        }
        
        for(int i=0; i<100; i++) {
        	for(int j=0; j<100; j++) {
        		if(paper[i][j]==1)
        			overlapSum++;
        	}
        }
        
        System.out.println(overlapSum);
        
        
    }
}
    