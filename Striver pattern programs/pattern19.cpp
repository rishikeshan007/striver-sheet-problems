import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
		    char ch = 'E';
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(ch--);
		    }
		    System.out.println();
		}
	}
}

o/p:
E
ED
EDC
EDCB
EDCBA
