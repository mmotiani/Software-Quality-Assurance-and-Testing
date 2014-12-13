package a1;

public class Triangle 
{
	public static String Triangle_Test(int a, int b, int c)
	{
		final int MIN = 1;
		final int MAX = 200;

		if(a < MIN || a > MAX)
			return "value of a is out of range"; 
		if(b < MIN || b > MAX)
			return "value of b is out of range"; 
		if(c < MIN || c > MAX)
			return "value of c is out of range"; 
		

		if((a < b+c) && (b < a+c) && (c < a+b)) 		// if triangle
		{ 
			if(a*a==(b*b+c*c)||b*b==(a*a+c*c)||c*c==(b*b+a*a))  		//if right angled and scalene triangle		
				return "Right Angled and Scalene Triangle";
			if(a == b && b == c && c==a)					//if equilateral triangle	
				return "Equilateral Triangle";
			else if(a != b && a != c && b != c)				//if scalene triangle
				return "Scalene Triangle";
				else							// if isoscles
				return "Isosceles triangle";
		} else
			    return "Not a triangle";
			
			
	}
	

}