import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a =3;
        int b=6;
        System.out.println(GCD(a,b));
        int c=5;
        int d=10;
        System.out.println(lcm(c,d));
        
         
    }
    static int GCD(int a,int b)     //GCD of 2 no's.
    {
        int ans=0;
        for(int i=1;i<=Math.min(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                ans=i;
            }
        }
       return ans;
    }
    static int lcm(int a,int b)     //lcm of 2 no's.
    {
        int ans=a*b/GCD(a,b);
        
        return ans;
    }
    
    static int HCF(int a,int b)      //hcf of 2 no's.
    {
        int ans=0;
        for(int i=1;i<=Math.max(a,b);i++)
        {
            if(a%i==0 && b%i==0)
            {
                ans=i;
            }
        }
        return ans;
    }
      
}
