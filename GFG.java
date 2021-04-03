import java.io.*; 
import java.util.Scanner;
class GFG 
{ 
	static void specialNumber(int n) 
	{ 
		int first,last,sum,pro;
		if(n < 10 || n > 99) 
			System.out.println("Invalid Input! " + 
						"Number should have " + 
								"2 digits only"); 
		else
		{ 
			first = n / 10; 
			last = n % 10; 
			sum = first + last; 
			pro = first * last; 
			
			if((sum + pro) == n) 
			{ 
				System.out.println(n + " is a Special" + 
								" Two-Digit Number"); 
			} 
			else
			{ 
				System.out.println(n +" is Not a Special" + 
									" Two-Digit Number"); 
			} 
		} 
	} 
	public static void main(String args[]) 
	{ 
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n : ");
		n = sc.nextInt();
		specialNumber(n); 
	} 
} 
