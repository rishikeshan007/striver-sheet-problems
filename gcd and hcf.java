import java.util.Scanner;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        int a =3;
        int b=6;
        System.out.println(GCD(a,b));
        int c=144;
        int d= 32;
        System.out.println(HCF(c,d));
        
         
    }
    static int GCD(int a,int b)
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
    
    static int HCF(int a,int b)
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

