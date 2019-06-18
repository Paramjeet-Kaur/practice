
public class cube {

	static double width;
	


public cube(double width)
{
	this.width=width;
}
public cube()
{
	this.width=0.0;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public static double getArea(double Area)
{
	Area=(6*width*width);
	return Area;
}
public static double getVolume(double Volume)
{
	Volume=(width*width*width);
	return Volume;

}
public static double getDiagonal(double Diagonal)
{
	Diagonal=(Math.sqrt(3.0)*width);
	return Diagonal;
}
public static void outputCubeInfo()
{
	
	System.out.println("length of one side" +width );
	System.out.println("surface Area" + getArea(width) );

	System.out.println("Volume" +getVolume(width) );

	System.out.println("Diagonal" +getDiagonal(width));
	
}

}

