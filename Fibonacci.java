package mycaptain_java;
//using recursive function
public class Fibonacci
{
	static int a=0;
	static int b=1;
	static int i=1;
	public static void main(String[] args)
	{
		int n=20;
		System.out.println("Fibonacci numbers in the range "+n);
		System.out.print("0\n1\n");
		recu_fib(n);
	}
	public static int recu_fib(int n)
	{
		int temp=b;
			b=a+b;
			a=temp;
			System.out.println(b);
			i++;
		if(i==n-1)
		return 0;
	    else 
		 return recu_fib(n);
	}
}