import java.util.Scanner;
import java.lang.Math;
public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner(System.in);
		System.out.println("Enter  a String to find the rev");
		String z= input.nextLine();
		String p=Reverse(z);
		System.out.println(p);
		System.out.println("Enter the string");
		String i=input.nextLine();
		int x=Addition(i);
		System.out.println("the output of string is " +x);

	}
	public static String Reverse(String a)
	{
		String x="";
		for(int i= a.length()-1;i>=0;i--)
		{
			x+=a.charAt(i);
		}
		return x;
	}
	public static int Addition(String number)
	{
		int total=0;
		for(int i=0;i<=number.length()-1;i++)
		{
			
			char number1=number.charAt(i);
			
			
			if(number1==',')
			{	
			}
			else 
			{
				String c=Character.toString(number1);
				int number2=Integer.parseInt(c);
				total=total+number2;
			}
		
		}
		return total;
	}
	private static char charAt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
