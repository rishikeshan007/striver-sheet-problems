import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		//1 st form
		for(int i=1;i<=n;i++)
		{
		    for(int j=n;j>=i;j--)
		    {
		        System.out.print("*");
		    }
		    
		    for(int spaces=1;spaces<=2*i-1;spaces++)
		    {
		        System.out.print(" ");
		    }
		    
		    for(int j=n;j>=i;j--)
		    {
		        System.out.print("*");
		    }
		    System.out.println();
		 }
		   //2nd form  
		    for(int i=1;i<=n;i++)
		    {
		        for(int j=1;j<=i;j++)
		        {
		            System.out.print("*");
		        }
		        for(int spaces=2*(n-i)-1;spaces>=0;spaces--)
		        {
		            System.out.print(" ");
		        }
		        for(int j=1;j<=i;j++)
		        {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
	}
}

o/p:
* * * * * * * * * * 
* * * *     * * * *
* * *         * * *
* *             * *
*                 *
*                 *
* *             * *
* * *         * * *
* * * *     * * * *
* * * * * * * * * * 
