package JavaProgram;

import java.util.Scanner;

public class prime_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(n+" is a prime number");
		}
		else
		{
			System.out.println(n+" is not a prime number");
		}

	}

}
