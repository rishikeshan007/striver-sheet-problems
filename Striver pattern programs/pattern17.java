import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
		    
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(ch+" ");
		        
		    }
		    ch++;
		    System.out.println();
		}
	}
}

o/p:
A
B B
C C C
D D D D
E E E E E
