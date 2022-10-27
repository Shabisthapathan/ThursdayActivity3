package com.swap;
import java.util.*;
class Main
{
	int a,b;
	
	void swap(Main ob)
	{
		int tmp=ob.a;
		ob.a=ob.b;
		ob.b=tmp;
	}
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a and b:");
		a=sc.nextInt();
		b=sc.nextInt();
	}
}
public class SwapTwoValues {


	public static void main(String[] args) {
		Main ob=new Main();
		ob.get();
		ob.swap(ob);
		System.out.println(ob.a+" "+ob.b);

	}

}
