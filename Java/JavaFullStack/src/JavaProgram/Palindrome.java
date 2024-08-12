package JavaProgram;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),temp=n,k=0,d=0;
		while (n>0)
        {
            d=n%10;
            k=(k*10)+d;
            n/=10;
        }
        if(k==temp)
        {
            System.out.println(temp+" is a palindrome number");
        }
        else
        {
            System.out.println(temp+" is not a palindrome number");

        }
	}

}
