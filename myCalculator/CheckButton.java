package myCalculator;
//Checks if Number or Decimal can be used (Prevents concatenation to "Enter Number first" message)
public class CheckButton
{
	 	public static boolean checkNum(String s)
 	{
 		return(!s.equals("") && (!Character.isDigit(s.charAt(0)) && s.charAt(0)!='.' && s.charAt(0)!='-'));
 	}
 	//Checks if Operator can be used
 	public static boolean checkOper(String s)
	{
		return(!s.equals("") && (Character.isDigit(s.charAt(0)) || (((s.charAt(0)=='.'||s.charAt(0)=='-') && s.length()>=2)||(s.length()>2&&s.charAt(1)=='.'||s.charAt(0)=='-'))));	
	}
}