package A_2methodWithReturnType;

public class Sample1 
{
	public static void main(String[] args) {
		
		int num1 = add(10,20);
		System.out.println(num1);
		
		System.out.println(add(54, 30));
		System.out.println("-------");
		
		String s1 = ConvertNameToCapital("abcd");
		System.out.println(s1);
		
		System.out.println(ConvertNameToCapital("xyz"));
		System.out.println("-------");
		
		Sample1 s2 = new Sample1();
		int num2 = s2.mult(20, 50);
		System.out.println(num2);
		
		System.out.println(s2.mult(30, 56));
		
	}
	
	public static int add(int a, int b)
	{
		int sum= a+b;
		return sum; 
	}
	
	public static String ConvertNameToCapital(String name)
	{
		 String s1 = name.toUpperCase();
		 return s1;
	}
	
	public int mult(int a, int b)
	{
		int sum = a*b;
		return sum;
	}

}
