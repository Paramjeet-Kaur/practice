
public class Storeresult {

	public static void main(String[] args) {
		StoreItem a=new StoreItem("car",1,200);
		StoreItem b=new StoreItem("jeep",1,200);
		String description1=a.getDescription();
		int units=a.getUnitsAvailable();
		{
			boolean e=StoreItem.inStock();
			System.out.println(e);
			
		}
		int price1=a.getPrice();
		
		{
			price1=(price1)*13/100;
		}
		int price3=a.getPrice();
		System.out.println("description is " + description1);
		System.out.println("units are "+units);
		System.out.println("price is "+(price1+price3));
		
		

	}

}

