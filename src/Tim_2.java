import java.util.Scanner;
public class Tim_2 {
	public static void main(String[] args)
	{
		Tim_1 chair= new Tim_1("hmm",7);
		Tim_1 lastname=new Tim_1("SANDHU");
		chair.manpreet(); //calling method from tim_1.java using object
			System.out.println(lastname.surname);// calling variable using object
		
			System.out.println(mani("manpreet"));
			System.out.println("Enter a number");
			Scanner keyboard= new Scanner(System.in);
			int primenumber=keyboard.nextInt();
			
			boolean m=checkprime(primenumber);
			if(m==true)
			System.out.println("it is prime");
			if(m==false)
				System.out.println("it is not prime");
		
	}
	public static String mani(String man)
	{
		return man + " is looking at me";
	}
	public static boolean checkprime(int param)
	{
		boolean y=true;
		for(int i=2;i<param;i++)
		{
			if(param%i==0)
			{
				y=false;
			}
		}
		return y;
	}
}
