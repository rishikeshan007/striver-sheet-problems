import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int n = input.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n-i+1;j++)
	        {
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }
		
	}
}

o/p:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
