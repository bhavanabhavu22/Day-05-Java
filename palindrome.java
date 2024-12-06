import java.util.*;

import javax.lang.model.util.ElementScanner14;
public class palindrome {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int n=sc.nextInt();
            int temp=n;
            int rev=0;
            while(n>0)
            {
               int digit=n%10;
                rev=rev*10+digit;
                n/=10;
            }
            System.out.println(rev);
            if(temp==rev)
            {
            System.out.println("PALINDROME");
            }
            else
            {
            System.out.println("NOT A PALINDROME");
            }
                }   
            }
        }
        
    
