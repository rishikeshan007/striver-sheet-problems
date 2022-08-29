import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
		    if(i==1||i==4)
		    {
		        for(int j=1;j<=n;j++)
		        {
		            System.out.print("*");
		        }
		        System.out.println();
		    }
		    else{
		        for(int j=1;j<=n;j++)
		        {
		            if(j==1||j==4)
		            {
		                System.out.print("*");
		            }
		            else{
		                System.out.print(" ");
		            }
		        }
		        System.out.println();
		    }
		}
	
	}
}

o/p:
* * * *
*     *
*     *
* * * *
