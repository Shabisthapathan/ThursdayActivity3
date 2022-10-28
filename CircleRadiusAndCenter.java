package com.Circle;

class Circle
{
	private float center;
	private float radius;
	private static int count=0;
	Circle()
	{
		System.out.println("Constructor with no parameters");
	}
	Circle(float center,float radius)
	{
		this.center=center;
		this.radius=radius;
		count++;
	}



	public static void main(String[] args) {
		Circle c1=new Circle(12.1f,20.5f);
		Circle c2=new Circle(13.2f,25.7f);
		System.out.println("Circle 1-center:"+c1.center+"Radius:"+c1.radius);
		System.out.println("Circle 2-center:"+c2.center+"Radius:"+c2.radius);
		System.out.println("No.of instaces of class Circle:"+Circle.count);
	}

}
