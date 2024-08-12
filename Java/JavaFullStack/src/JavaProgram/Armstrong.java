package JavaProgram;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),c=0,d=0,mul=1,temp=n,k=n,sum=0;
        while (n>0)
        {
            d=n%10;
            c++;
            n/=10;
        }
        d=0;
         
              for(int i=1;i<=c;i++) 
             {
              d=k%10;
              mul=1;
              for(int j=1;j<=c;j++)
              {
                mul*=d;
              }
              k/=10;
              sum+=mul;
            }
            
        
        if(temp==sum)
        {
            System.out.println("Armstrong number");
        }
        else {
            System.out.println("not a armstrong number");
        }

	}

}
