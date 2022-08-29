import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i=1;i<=n;i++)
		{
		    char ch='A';
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(ch+++" ");
		        
		    }
		    System.out.println();
		}
	}
}

o/p:
A
A B
A B C
A B C D
A B C D E
