package Varios;
import java.awt.Point;

class MyRect
{
    // creacion de variables de instancia
    int x1=0;
    int x2=0;
    int y1=0;
    int y2=0;
    // creacion de metodos sobrecargados
    MyRect buildrect(int x1, int y1,int x2,int y2)
    {
	this.x1=x1;
	this.x2=x2;
	this.y1=y1;
	this.y2=y2;
	return this;
    }
 // creacion de metodos sobrecargados
    MyRect buildrect(Point topleft, Point bottomRight)
    {
	x1=topleft.x;
	y1=topleft.y;
	x2=bottomRight.x;
	y2=bottomRight.y;
	return this;
    }
    
    MyRect buildrect(Point topleft, int w, int h)
    {
	x1=topleft.x;
	y1=topleft.y;
	x2= (x1 + w);
	y2= (y1 + h);
	return this;
    }
    void printRect ()
    {
	System.out.print("MyRect : <" + x1 + " , " + y1 );
	System.out.println(" , " + x2 + " , " + y2 +" >");
    }
    public static void main(String[] args)
    {
	// creacion de un objeto
	MyRect rect = new MyRect();
	// imprecion usando metodo buildrect pasando 4 argumentos enteros 
	System.out.println("llamado al metodo buildrect pasando como argumento 4 variables enteras 25,25,50,50");
	rect.buildrect(25, 25, 50, 50);
	rect.printRect();
	System.out.println("llamado al metodo buildrect pasando dos points (10,10) (20,20)");
	rect.buildrect(new Point(10,10), new Point (20,20));
	rect.printRect();
	System.out.println("llamado al metodo buildrect pasando un point (10,10) y dos enteros 50,50");
	rect.buildrect(new Point(10,10), 50, 50);
	rect.printRect();
    }
}
