package JavaProgram;
import java.util.Random;   
import java.util.Scanner;

public class Random_num {

	public static void main(String[] args) {
		Random random = new Random(); 
		int a=random.nextInt();
		float b=random.nextFloat();
		double c=random.nextDouble();
		long d=random.nextLong();
		boolean e=random.nextBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}

}
