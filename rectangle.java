//write a code to create a class called triangle take any no of fields and display their values 
package unit3;

class rectanglee
{
    //Attributes(fields)
    private double length;
    private double width;

//constructor
public rectanglee(double length,double width)
{
    this.length=length;
    this.width=width;
}

//Method to calculate area
public double getArea()
{
    return length*width;
}

//Method to calculate perimeter
public double getPerimeter()
{
    return 2 *(length+width);
}

//Method to display rectangle information
public void displayinfo()
{
    System.out.println("rectangle[lemgth:"+length+",width:"+width+"]");
    System.out.println("area:"+getArea());
    System.out.println("perimeter:"+getPerimeter());
}
}

public class rectangle
{
    public static void main(String[]args)
    {
        //creating two rectangle objects
        rectanglee rect1=new rectanglee(5,3);
        rectanglee rect2=new rectanglee(7,4);

        //display info for each rectangle
        System.out.println("rectangle 1:");
        rect1.displayinfo();

        System.out.println("rectangle 2:");
        rect2.displayinfo();

    }
    
}