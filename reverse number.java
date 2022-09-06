import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int n = 22222;
        System.out.println(reverse(n));
        
        
    }
    static int reverse(int n)
    {
        int ans=0;
        while(n!=0)
        {
            int rem=n%10;
            ans=ans*10+rem;
            n/=10;
        }
        return ans;
    }

}

