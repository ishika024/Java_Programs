import java.util.*;
interface Shape
{
    void getArea();
	void input();
	void getVolume();
}
class Circle implements Shape
{
	double R;
	final double PI = 3.14;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter Radius : ");
		R = input.nextDouble();
	}
	public void getArea()
	{
	    double C = PI*R*R;
		System.out.println("area of circle : " + C);
	}
	public void getVolume()
	{
	}
}
class Square implements Shape
{
	int side;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
		System.out.println("Enter Side : ");
		side = input.nextInt();
	}
	public void getArea()
	{
	    int ar = side*side;
		System.out.println("area of square : " + ar);
	}
	public void getVolume()
	{
	}
}
class Triangle implements Shape
{
	double base,height ;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter Base : ");
	    base = input.nextDouble();
		System.out.println("Enter Height : ");
	    height = input.nextDouble();
	}
	public void getArea()
	{
	    double T = (base*height)/2;
		System.out.println("area of triangle : " + T);
	}
	public void getVolume()
	{
	}
}
class Sphere implements Shape
{
	double radius ;
	final double PI = 3.14;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter radius : ");
	    radius = input.nextDouble();
	}
	public void getArea()
	{
	    double S = 4*PI*radius*radius;
		System.out.println("area of Sphere : " + S);
	}
	public void getVolume()
	{
		double V = (4/3)*PI*radius*radius*radius;
		System.out.println("volume of Sphere : " + V);
	}
}
class Cube implements Shape
{
	int side ;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter side : ");
	    side = input.nextInt();
	}
	public void getArea()
	{
	    int ar = 6*side*side ;
		System.out.println("area of cube : " + ar);
	}
	public void getVolume()
	{
		int V = side*side*side;
		System.out.println("volume of cube : " + V);
	}
}
class Tetrahedron implements Shape
{
	double edge ;
	public void input()
	{
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter edges : ");
	    edge = input.nextDouble();
	}
	public void getArea()
	{
	    double S = 1.732*edge*edge;
		System.out.println("area of Tetrahedron : " + S);
	}
	public void getVolume()
	{
		double V = (edge*edge*edge)/(6*1.414);
		System.out.println("volume of Tetrahedron : " + V);
	}
}


class AreaInMain {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		Shape[] s = new Shape[6];
		System.out.println("Enter the choice:\n a: two\n b: three");
		char ch = input.next().charAt(0);
		switch(ch)
		{
			case 'a':
			for(int i=0 ; i<s.length ; i++)
			{
				System.out.println("Enter the choice:\n1: Area of circle\n2: Area of square\n3: Area of triangle");
				int choice = input.nextInt();
				switch(choice)
				{
					case 1:
						s[i]= new Circle();
						break;
					case 2:
						s[i] = new Square();
						break;
					case 3:
						s[i] = new Triangle();
						break;
					default:
						System.out.println("Enter right choice ");
						break;
				}
				break;
			}
			break;
			case 'b':
			for(int i=0 ; i<s.length ; i++)
			{
				System.out.println("Enter the choice:\n1: Sphere \n2: Cube\n3: Tetrahedron");
				int choice = input.nextInt();
				switch(choice)
				{
					case 1:
						s[i]= new Sphere();
						break;
					case 2:
						s[i] = new Cube();
						break;
					case 3:
						s[i] = new Tetrahedron();
						break;
					default:
						System.out.println("Enter right choice ");
						break;
				}
				break;
			}
			break;
		}
		for(int i=0 ; i<s.length ; i++)
		{
			s[i].input();
			break;
		}
		for(int i=0 ; i<s.length ; i++)
		{
			s[i].getArea();
			break;
		}
		for(int i=0 ; i<s.length ; i++)
		{
			s[i].getVolume();
			break;
		}
	}
}	