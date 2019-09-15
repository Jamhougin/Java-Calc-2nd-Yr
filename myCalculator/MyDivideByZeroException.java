package myCalculator;

public class MyDivideByZeroException extends IllegalArgumentException  
{
	public MyDivideByZeroException(String msg)
	{
		super(msg);
	}
}
