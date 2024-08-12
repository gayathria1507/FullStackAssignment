package JavaProgram;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),fact=1;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
			System.out.print(fact+" ");
		}
		System.out.println();
		System.out.println(fact);
	}

}
