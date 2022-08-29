import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		    if(i%2!=0)
		    {
		        int count=1;
		        for(int j=1;j<=i;j++)
		        {
		            if(count==1)
		            {
		                System.out.print(count+" ");
		                count--;
		            }
		            else{
		                System.out.print(count+" ");
		                count++;
		            }
		        }
		        System.out.println();
		    }
		    else{
		        int count=0;
		        for(int j=1;j<=i;j++)
		        {
		            if(count==0)
		            {
		                System.out.print(count+" ");
		                count++;
		            }
		            else{
		                System.out.print(count+" ");
		                count--;
		            }
		        }
		        System.out.println();
		    }
		    
		}
		
	}
}
