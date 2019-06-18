
public class StoreItem {
	String Description;
	static int unitsAvailable;
	int price;


public StoreItem(String description,int unitsavailable,int price)
{
	this.Description=description;
	this.unitsAvailable=unitsavailable;
	this.price=price;
}


public String getDescription() {
	return Description;
}


public void setDescription(String description) {
	Description = description;
}


public int getUnitsAvailable() {
	return unitsAvailable;
}


public void setUnitsAvailable(int unitsAvailable) {
	this.unitsAvailable = unitsAvailable;
}


public int getPrice() {
	return price;
}


public void setPrice(int price) {
	this.price = price;
}
public static boolean inStock()
{
	boolean x= true;
	if(unitsAvailable>0) {
		return x;
	}
	return x;
}
}
