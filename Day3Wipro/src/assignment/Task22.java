package assignment;
/*
 * 22.Create two interfaces namely Drawable and Fillable. Create class called Line, Circle, Square and
implement following methods through interface.

<I>Drawable ------ drawingColor(), thickness ()
<I>Fillable ---------- fillingColor (), size ()

 */
interface Drawable
{
	void drawingColor();
	void thickness ();
}
interface Fillable
{
	void fillingColor ();
	void size ();
}
class Line implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		System.out.println("Line does not have filling color.");
		
	}

	@Override
	public void size() {
		System.out.println("Line Length:200units");
		
	}

	@Override
	public void drawingColor() {
		 System.out.println("Line Drawing Color:Black");
	}

	@Override
	public void thickness() {
		System.out.println("Line Thickness: 1px");
		
	}
	
}
class Circle implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		 System.out.println("Circle Filling Color: Light Blue");
		
	}

	@Override
	public void size() {
		System.out.println("Circle Radius:25units");
		
	}

	@Override
	public void drawingColor() {
		System.out.println("Circle Drawing Color:Brown");
		
	}

	@Override
	public void thickness() {
		 System.out.println("Circle Border Thickness:2px");
		
	}
		
}
class Square implements Drawable,Fillable
{

	@Override
	public void fillingColor() {
		System.out.println("Square Filling Color:yellow");
		
	}

	@Override
	public void size() {
		System.out.println("Square Side Length:20 units");
		
	}

	@Override
	public void drawingColor() {
		System.out.println("Square Drawing Color:Red");
		
	}

	@Override
	public void thickness() {
		System.out.println("Square Border Thickness:4px");
		
	}
	
}

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Line");
        Line line=new Line();
        line.fillingColor();
        line.size();
        line.drawingColor();
        line.thickness();        
        System.out.println("Circle:");
        Circle circle=new Circle();
        circle.fillingColor();
        circle.size();
        circle.drawingColor();
        circle.thickness();
        System.out.println("Square:");
        Square square=new Square();
        square.fillingColor();
        square.size();
        square.drawingColor();
        square.thickness();
       
		
	}

}
