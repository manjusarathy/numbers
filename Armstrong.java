import java.io.*;
import java.util.*;
public class Armstrong
{
	public static void main(String args[])
	{
		int n,s=0,temp,r,d=0,x,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number to check if it is an Armstrong number");      
		n = sc.nextInt();
		temp = n;
		while(temp!=0)
		{
			d++;
			temp/=10;
		}
		temp = n;
		while(temp!=0)
		{
			r = temp%10;
			x=1;
			for(i=1;i<=d;i++)
				x=x*r;
			s = s+x;
			temp/=10;
		}
		if (n == s)
			System.out.println(n + " is an Armstrong number.");
      else
    	  System.out.println(n + " isn't an Armstrong number.");   
	}
}