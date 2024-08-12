package JavaProgram;

public class CompareTwoObject {

	public static void main(String[] args) {
		Double x = new Double(545.25);  
		Long y = new Long(233344);  
		if(x.equals(y))
		{
			System.out.println("Objects are equal");
		}
		else
		{
			System.out.println("Objects are not equal");
		}
	}

}
