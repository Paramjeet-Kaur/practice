import java.lang.Math;
import java.util.Scanner;
public class FunctionsPractice {
	public static void main(String[] args)
	{
		
	Scanner Keyboard= new Scanner(System.in);
	System.out.println("Enter the String you want to reverse");
	String line2=Keyboard.nextLine();
	char[] reverse=new char[line2.length()];
	reverse =Reverse(line2);
	for(int i=0;i<=reverse.length-1;i++)
	{
	System.out.print( reverse[i]);
	}
	
	/*System.out.println("Enter the String ");
	String line1=Keyboard.nextLine();
	int addition=sumNumbers(line1);
	System.out.println("The total addition of words is " + addition);

	
	System.out.println("Enter the String ");
	String line=Keyboard.nextLine();
	int numberofwords=countWords(line);
	System.out.println("The total number of words in string are " + numberofwords);
	
		System.out.println("Enter the height of Rectangle");
		double height=Keyboard.nextDouble();
		System.out.println("Enter the width of rectangle");
		double width=Keyboard.nextDouble();
		double area=getArea(height,width);
		double perimeter=getPerimeter(height,width);
		System.out.println("The total height of reactangle is "+ height);
		System.out.println("The total width of reactangle is "+ width);
		System.out.println("The total area of reactangle is "+ perimeter);
		System.out.println("The total area of reactangle is "+ area);
		
		boolean x1=checkPrime(8);
		if (x1==false)
			System.out.println("it is not prime");
		if (x1==true)
			System.out.println("it is  prime");
		
		System.out.println(calculateSpeed(7,8) +" is the total speed travelled by the car");
		
		
		String B1=PSVM(4,100000,4,7,22 );
		if (B1=="Profit")
		System.out.println("PROFIT");
		if(B1=="Loss")
		System.out.println("LOSS");*/
		
		
	}
	public static double calculateSpeed(int distance,int time)
	{
		double speed;
		speed=(double)(distance)/(time);
		return speed;
	}
	public static boolean checkPrime(int primenumber)
	{
		boolean y=true;
		for(int i=2;i<primenumber;i++)
		{	
			if(primenumber%i==0)
			{
				y= false;
			}
		}
		return y;
		
	}
	public static String PSVM(int NS,int SP,int PP,int PC,int SC)
	{	
		String x="Profit";
		String y="Loss";		
		Double profit=0.0;
		profit = (double) (((NS * SP) - SC) - ((NS*PP) + PC));
		if(profit>=0)
		{
			return x;
		}
		return y;

		
	}
	public static double getArea(double height,double width)
	{
		Double area1;
		area1=height*width;
		return area1;
	}
	public static double getPerimeter(double height,double width)
	{
		Double perimeter1;
		perimeter1=(2*height) + (2*width);
		return perimeter1;
	}
	public static int countWords(String words)
	{	
		
		 int count = 0;
		  for (int i = 0; i < words.length(); i++) 
		  {
		    if (words.charAt(i) == ' ')
		    {
		      count = count + 1;
		    }
		  }
		  return count+1;

	}
	public static int sumNumbers(String sum )
	{	

		  int total = 0;
		  for (int i = 0; i < sum.length(); i++) 
		  {
		    char currentCharacter = sum.charAt(i);
		    if (currentCharacter == ',')
		    {
		    }
		    else 
		    {

		      String x = Character.toString(currentCharacter);
		      int number = Integer.parseInt(x);
		      total = total + number;
		    }
		  } 
		  return total;
		  
		}
	 public static int Reverse(Stringnumber)
	





















   
	
	
	
