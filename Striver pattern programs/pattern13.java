import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
	
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i; j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }
	}
}

o/p:
1             1
1 2         2 1
1 2 3     3 2 1
1 2 3 4 4 3 2 1
