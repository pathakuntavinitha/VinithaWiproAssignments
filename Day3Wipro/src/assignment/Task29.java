package assignment;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.lang.NumberFormatException;

/*
 * Read the Register Number and Mobile Number of a student. 
 * If the Register Number does not contain exactly 9 characters or if the Mobile Number does not contain exactly 10 characters, throw an IllegalArgumentException. 
 * If the Mobile Number contains any character other than a digit, raise a NumberFormatException.
 *  If the Register Number contains any character other than digits and alphabets, throw a NoSuchElementException. If they are valid, print the message ‘valid’ else ‘invalid’
 */
public class Task29 {
	public static void main(String[] args) throws NumberFormatException
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter Register number");
			String regnum=sc.nextLine();
			System.out.println("Enter Mobile number");
			String mobnum=sc.nextLine();
			if(regnum.length()!=9 || mobnum.length()!=10)
			{
				throw new IllegalArgumentException("Length not valid");
			}
			for(int i=0;i<regnum.length();i++)
			{
				char ch=regnum.charAt(i);
				if(!Character.isLetterOrDigit(ch))
				{
					throw new NoSuchElementException("Register number not valid");
				}
				
			}
			/*
			for(int i=0;i<mobnum.length();i++)
			{
				char ch=mobnum.charAt(i);
				if(!Character.isDigit(ch))
				{
					throw new NumberFormatException("Mobile Number not valid");
				}
			}*/
			if (!mobnum.matches("\\d{10}")) {
                throw new NumberFormatException("Mobile must be digits only");
			}
			System.out.println("Valid");
		}

		catch (IllegalArgumentException | NoSuchElementException e) {
            System.out.println("invalid");
		}
	}

}
