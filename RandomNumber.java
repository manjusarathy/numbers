import java.util.*;
public class RandomNumber
{
	public static void main(String args[])
	{
		int i;
		Random t = new Random();
		for(i=1;i<=10;i++)
		{
			System.out.println(t.nextInt(100));
		}
	}
}